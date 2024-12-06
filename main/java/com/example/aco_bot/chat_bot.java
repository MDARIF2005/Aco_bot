package com.example.aco_bot;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
//speech recognition
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;

import android.view.View;
//contanier
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


//for adition query
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class chat_bot extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView welcomeText;
    EditText messageEditText;
    ImageButton sendButton, micButton;
    List<Message> messageList;
    MessageAdapter messageAdapter;
    TextToSpeech textToSpeech;
    SpeechRecognizer speechRecognizer;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recycler_view);
        welcomeText = findViewById(R.id.welcome_text);
        messageEditText = findViewById(R.id.message_edit_text);
        sendButton = findViewById(R.id.send_btn);
        micButton = findViewById(R.id.mic_btn);

        messageList = new ArrayList<>();
        messageAdapter = new MessageAdapter(messageList);
        recyclerView.setAdapter(messageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize TextToSpeech
        textToSpeech = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                textToSpeech.setLanguage(Locale.ENGLISH);
            }
        });

        // Initialize SpeechRecognizer
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);

        // Microphone button for speech input
        micButton.setOnClickListener(v -> startListening());

        // Send button for manual text input
        sendButton.setOnClickListener(v -> {
            String question = messageEditText.getText().toString().trim();
            if (!question.isEmpty()) {
                addToChat(question, Message.Sent_by_me);
                messageEditText.setText("");
                callAPI(question, false); // Text-based question
                welcomeText.setVisibility(View.GONE);
            }
        });
    }

    @Override
    protected void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        super.onDestroy();
    }

    private void startListening() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle params) {
                Toast.makeText(chat_bot.this, "Listening...", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResults(Bundle results) {
                ArrayList<String> matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                if (matches != null && matches.size() > 0) {
                    String voiceInput = matches.get(0);
                    addToChat(voiceInput, Message.Sent_by_me);
                    callAPI(voiceInput, true); // Voice-based question
                }
            }

            @Override
            public void onError(int error) {
                Toast.makeText(chat_bot.this, "Error: " + error, Toast.LENGTH_SHORT).show();
            }

            // Other unused callback methods can remain empty
            @Override public void onBeginningOfSpeech() {}
            @Override public void onBufferReceived(byte[] buffer) {}
            @Override public void onEndOfSpeech() {}
            @Override public void onEvent(int eventType, Bundle params) {}
            @Override public void onPartialResults(Bundle partialResults) {}
            @Override public void onRmsChanged(float rmsdB) {}
        });

        speechRecognizer.startListening(intent);
    }

    void addToChat(String message, String sentBy) {
        runOnUiThread(() -> {
            messageList.add(new Message(message, sentBy));
            messageAdapter.notifyDataSetChanged();
            recyclerView.smoothScrollToPosition(messageAdapter.getItemCount());
        });
    }

    void addResponse(String response, boolean isVoiceCommand) {
        messageList.remove(messageList.size() - 1); // Remove the typing message
        runOnUiThread(() -> {
            if (isVoiceCommand) {
                textToSpeech.speak(response, TextToSpeech.QUEUE_FLUSH, null, null);
                addToChat(response, Message.Sent_by_bot); // Speak the response
            } else {
                addToChat(response, Message.Sent_by_bot); // Text response in chat
            }
        });
    }

    void callAPI(String question, boolean isVoiceCommand) {
        messageList.add(new Message("Typing...", Message.Sent_by_bot));
        Random r=new Random();

        if (question.contains("what's the time")||question.contains("the time now")) {
            String currentTime = new SimpleDateFormat("hh:mm a", Locale.getDefault()).format(new Date());
            addResponse("The current time is " + currentTime, isVoiceCommand);


        } else if (question.contains("what's the date")|| question.contains("the date today")) {
            String currentDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
            addResponse("Today is " + currentDate, isVoiceCommand);
        }



       else if (question.contains("project")) {
            String ans="this ia an AI chatbot, developed with Android Studio. " +"\n which is a project developed by MD ARIF and his team by using java programing language";
            addResponse(ans,isVoiceCommand);



       }
       else {
            Data d=new Data();
            for (String[] questions : d.Que.keySet()) {
                for (String i : questions) {
                    if (question.contains(i)) {
                        String[] answers = d.Que.get(questions);
                        addResponse(answers[r.nextInt(answers.length)],isVoiceCommand);
                        return;
                    }



                }
            }


            String[] res={"sorry i didn't get that ","sorry for inconvenient your question: "+question+"there is no data available in me","no idea about it","i dont know"};
            addResponse(res[r.nextInt(res.length)],isVoiceCommand);

        }
    }
}