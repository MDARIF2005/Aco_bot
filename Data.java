package com.example.aco_bot;

import java.util.HashMap;

public class Data {
    HashMap<String[],String[] > Que;
    public Data() {
        Que=new HashMap<>();
        String[]Q1={"tell me a joke","tell a joke","a joke","more joke","1 one more joke","one more joke"};
        String[]A1={"A man walks into a library, goes up to the librarian and says, 'I’d like a cheeseburger, fries, and a soda.'\n" +
                "The librarian looks at him and says, 'Sir, this is a library.'\n" +
                "The man whispers, 'Oh, sorry... I’d like a cheeseburger, fries, and a soda.'",

                "A guy walks into a bar with a large piece of cardboard. He goes up to the bartender and says, 'I’ll have a drink, and this is my date for the evening.'\n" +
                        "The bartender says, 'I see... what’s her name?'\n" +
                        "The guy responds, 'Her name’s Carmen, she’s a bit flat, but she’s always there when I need her.'",

                "A woman walks into a shop and asks, 'Do you have anything for a sore throat?'\n" +
                        "The shopkeeper says, 'Sure, I’ve got cough drops, lozenges, and some hot tea.'\n" +
                        "The woman looks at him and says, 'No, I meant for the guy who’s been talking my ear off all day!'",

                "A man and a friend are walking in the forest when they spot a bear.\n" +
                        "The friend says, 'I heard that if you run, the bear will catch you.'\n" +
                        "The man takes off his shoes and starts running.\n" +
                        "His friend looks confused and asks, 'What are you doing? You can’t outrun the bear!'\n" +
                        "The man says, 'I don’t need to outrun the bear, I just need to outrun you.'",

                "A guy walks into a bar and orders a drink.\n" +
                        "The bartender says, 'You know, we’ve got a special tonight – one drink and you get a free giraffe.'\n" +
                        "The guy raises an eyebrow and asks, 'A giraffe? What am I supposed to do with that?'\n" +
                        "The bartender smiles and says, 'Nothing, just enjoy the view.'",

                "A man walks into a dentist's office and says, 'I think I’m going crazy.'\n" +
                        "The dentist looks at him and asks, 'What makes you think that?'\n" +
                        "The man replies, 'Every time I walk past a mirror, I smile at myself, and my teeth seem to disappear.'",

                "A man is walking down the street when he sees a sign in front of a house that reads, 'Talking Dog for Sale.'\n" +
                        "Intrigued, he knocks on the door, and the owner invites him in.\n" +
                        "Inside, the man asks the dog, 'So, can you talk?'\n" +
                        "The dog replies, 'Yep, I’ve had quite an interesting life. I’ve been a police dog, a therapy dog, and I even worked on a Hollywood set for a while.'\n" +
                        "The man is amazed and turns to the owner, asking, 'How much do you want for him?'\n" +
                        "The owner replies, 'Ten dollars.'\n" +
                        "The man exclaims, 'Ten dollars? Why so cheap?'\n" +
                        "The owner shrugs and says, 'He’s a liar. He didn’t do any of that stuff.'",

                "A guy walks into a store, buys a pack of gum, and says to the cashier, 'Can I get a refund?'\n" +
                        "The cashier looks at him and says, 'You just bought it!'\n" +
                        "The guy shrugs and says, 'Yeah, but it’s not the flavor I expected. I was hoping for something with more of a ‘pop.’'",

                "A man goes to a therapist and says, 'Doctor, I’ve got a problem. I keep thinking I’m a deck of cards.'\n" +
                        "The therapist replies, 'Don’t worry, I’ll deal with you later.'",

                "A kid comes home from school and says, 'Mom, I got a part in the school play!'\n" +
                        "The mother asks, 'What part are you playing?'\n" +
                        "The kid responds, 'I’m going to be the husband.'\n" +
                        "The mother looks confused and asks, 'The husband? Why not the lead?'\n" +
                        "The kid replies, 'I figured the husband’s role would be easy, I can always just stay home!'",

                "A man walks into a restaurant, sits down, and says to the waiter, 'I’ll have the steak.'\n" +
                        "The waiter asks, 'How would you like it cooked?'\n" +
                        "The man replies, 'Surprise me!'\n" +
                        "The waiter returns with a well-done steak and says, 'Here you go, just the way you ordered it.'\n" +
                        "The man frowns and says, 'I said surprise me, not ruin my meal.'",

                "A woman goes to the doctor and says, 'Doctor, every time I touch my arm, it hurts. Every time I touch my leg, it hurts. Even when I touch my head, it hurts.'\n" +
                        "The doctor examines her and says, 'Well, the problem is simple. You’ve broken your finger.'",

                "A man walks into a bakery and says, 'I’ll have a dozen donuts, please.'\n" +
                        "The baker asks, 'What kind of donuts would you like?'\n" +
                        "The man looks around and says, 'I’ll just have the ones you’ve already made.'",

                "A man and his dog walk into a bar, and the bartender says, 'Hey, we don’t serve animals here!'\n" +
                        "The man replies, 'Don’t worry, my dog’s a professional. He’s just here for the snacks.'",

                "A woman tells her husband, 'I’ve got to go to the doctor. I think I’ve got a case of the hiccups.'\n" +
                        "The husband looks at her and says, 'Don’t worry, I’ll give you a glass of water, and you’ll be fine.'\n" +
                        "She shakes her head and says, 'You don’t get it. I’ve got the hiccups, but I also forgot my glasses!'",
                "A woman walked into a store and asked, 'Do you sell any used books?'\n" +
                        "The clerk replied, 'Sure, we sell used books all the time.'\n" +
                        "The woman thought for a moment and said, 'Then why do they call them books?'",

                "A guy walks into a store, buys a bottle of milk, and then says to the cashier, 'Do you have anything to carry it in?'\n" +
                        "The cashier looks at him and replies, 'Sir, we’re a grocery store, not a baggage claim.'",

                "Why don’t skeletons ever fight each other?\n" +
                        "Because they don’t have the guts!",

                "A teacher asked her students to use the word 'beans' in a sentence.\n" +
                        "One student said, 'My mother loves to cook beans.'\n" +
                        "The teacher replied, 'That’s a nice sentence. Anyone else?' Another student said, 'My mother loves to cook, beans!'",

                "A man walks into a bar and says, 'I’ll take a pint of beer and a shot of tequila.'\n" +
                        "The bartender says, 'You must be trying to forget something.'\n" +
                        "The man replies, 'Actually, I’m just trying to forget I ever ordered the tequila.'",

                "Why did the scarecrow win an award?\n" +
                        "Because he was outstanding in his field!",

                "A man asked a librarian, 'Do you have any books on paranoia?'\n" +
                        "The librarian replied, 'They’re right behind you.'",

                "A man walked into a doctor's office and said, 'I think I have a problem with my eyesight.'\n" +
                        "The doctor asked, 'What seems to be the problem?'\n" +
                        "'Well,' the man said, 'I can’t see myself getting any work done this week.'",

                "A man walked into a barber shop and said, 'I’ll take a haircut.'\n" +
                        "The barber looked at him and said, 'You can’t get one, I’m a hairdresser, not a miracle worker.'",

                "Why did the banana go to the doctor?\n" +
                        "Because it wasn’t peeling well!",

                "A man said, 'I just got a job at the bakery, but I’m not feeling too doughy about it.'\n" +
                        "His friend replied, 'Well, I guess you’re on a roll then.'",

                "Why did the bicycle fall over?\n" +
                        "Because it was two-tired!",

                "A man walks into a restaurant and says, 'I’ll have the steak, medium rare.'\n" +
                        "The waiter asks, 'How would you like it cooked?'\n" +
                        "The man replies, 'With heat, please.'",

                "Why did the math book look sad?\n" +
                        "Because it had too many problems!",

                "A woman said, 'I broke up with my gym. We just weren’t working out anymore.'",

                "A dog walks into a bar and says, 'I’ll have a drink.'\n" +
                        "The bartender looks at him and says, 'Sorry, we don’t serve your type.'\n" +
                        "The dog replies, 'I’m just here for the paws.'",

                "A man walked into a bar with a giraffe and said, 'Two drinks, please.'\n" +
                        "The bartender said, 'What’s with the giraffe?'\n" +
                        "The man replied, 'He’s my designated driver.'",

                "A couple was having dinner at a fancy restaurant when the husband noticed a strange noise coming from the ceiling.\n" +
                        "He looked up and said, 'I think the house is haunted.'\n" +
                        "The wife replied, 'I think it’s just your stomach.'",

                "Why was the math book always so stressed out?\n" +
                        "Because it was full of problems!",

                "A man walked into a store, looked around, and said, 'I’m looking for a book on anti-gravity.'\n" +
                        "The store clerk said, 'You won’t find it here, it’s impossible.'",
                "A couple was having dinner at a fancy restaurant when the husband noticed a strange noise coming from the ceiling. He looked up and said, 'I think the house is haunted.' The wife replied, 'I think it’s just your stomach.'",

                "One day, a man walked into a library, walked up to the librarian and said, 'I’d like a cheeseburger, fries, and a soda.' The librarian looked at him and said, 'Sir, this is a library.' The man whispered back, 'Oh, sorry... I’d like a cheeseburger, fries, and a soda.'",

                "A man and his dog walk into a bar, and the bartender says, 'Hey, we don’t serve animals here!' The man replies, 'Don’t worry, my dog’s a professional. He’s just here for the snacks.'",

                "A woman tells her husband, 'I’ve got to go to the doctor. I think I’ve got a case of the hiccups.' The husband looks at her and says, 'Don’t worry, I’ll give you a glass of water, and you’ll be fine.' She shakes her head and says, 'You don’t get it. I’ve got the hiccups, but I also forgot my glasses!'"
        };
        Que.put(Q1,A1);
        String[] Q2={"Hello", "Hi", "Hey", "Greetings", "Howdy","hello","hi","hey","greetings","howdy"};
        String[] A2={ "Hello, how can I assist you?",
                "Hi, how can I help you?",
                "Hey there! What can I do for you?",
                "Greetings! How can I be of service?",
                "Howdy! What’s up?"};
        Que.put(Q2,A2);
        String[] Q3={"How are you", "How’s it going", "How are you doing", "How’s everything","how are you","how's it going","how are you doing","how's everything"};
        String[] A3={"I'm doing great, thanks for asking!",
                "I'm doing great, thanks for asking! How about you?",
                "I'm good, thanks for checking in! How are you doing?",
                "Doing well! How about you?",
                "Everything's great, thanks! How's everything on your end?",
                "I'm fine, thanks for asking! How are you?"};
        Que.put(Q3,A3);
        String[] Q4={"How’s your day", "How’s life", "What’s going on", "What’s up", "How’s your day going","how's your day","how's life","what's going on","what's up","how's your day going"};
        String[] A4={"My day’s been good, thanks for asking! How’s yours going?",
                "My morning is going well, thanks! How about yours?",
                "Afternoon's been fine, thanks! How about yours?",
                "Evening's been peaceful so far, thank you! How’s your evening?"};
        Que.put(Q4,A4);
        String[] Q5={"Bye", "Goodbye", "See you later", "Take care", "Catch you later","bye","goodbye","see you later","take care","catch you later"};
        String[] A5={"Goodbye! See you next time.",
                "Goodbye! Take care!",
                "See you later, have a great day!",
                "Take care, talk soon!",
                "Catch you later, stay safe!"};
        Que.put(Q5,A5);
        String[] Q6={"Where are you located", "Where are you from", "What’s your location", "Where do you live","where are you located","where are you from","what's your location","where do you live "};
        String[] A6={"I’m not physically located anywhere, I exist on the cloud!",
                "I’m a digital assistant, so I don’t have a specific location.",
                "I exist in the cloud, always ready to assist you from anywhere!",
                "I'm virtually everywhere! I live on the cloud."};
        Que.put(Q6,A6);
        String[] Q7={"Are you always available", "Can you help me anytime", "Are you always on", "Are you 24/7","are you always available","can you help me anytime","are you always on","are you 24/7"};
        String[] A7={"Yes, I’m always available, ready to assist you anytime.",
                "I’m here 24/7, always ready to help!",
                "I’m available anytime you need assistance!",
                "I’m always here, just ask whenever you need help!"};
        Que.put(Q7,A7);
        String[] Q8={"What’s your favorite thing", "Do you have a favorite", "What do you like", "What’s your favorite color","whats your favorite thing","do you have a favorite","what do you like","what's your favorite color"};
        String[] A8={ "I don’t have favorites, but I’m here to assist with anything you like!",
                "I don’t have preferences, but I’m happy to help you find yours.",
                "I don’t have favorites, but I’m always here to make your experience better!",
                "I don’t have favorite things, but I enjoy helping you with yours!"};
        Que.put(Q8,A8);
        String[] Q9={"Can you give me a quote", "Tell me a quote", "Do you have any quotes", "Share a quote with me","a quotes","can you give me a quote","tell me a quote","do you have any quotes","share a quote with me"};
        String[] A9={ "Here's a quote: 'The only way to do great work is to love what you do.' – Steve Jobs",
                "Sure! 'Success is not final, failure is not fatal: It is the courage to continue that counts.' – Winston Churchill",
                "'Life is what happens when you're busy making other plans.' – John Lennon",
                "Here's a great one: 'The future belongs to those who believe in the beauty of their dreams.' – Eleanor Roosevelt"};
        Que.put(Q9,A9);
        String[] Q10={"What’s the latest news", "Can you tell me the news", "What’s happening in the world", "Any news updates","what's the latest news","can you tell me the news","what's happening in the world","any news updates"};
        String[] A10={  "I don’t have real-time news updates, but I can help you find them online!",
                "I can’t provide real-time news, but I recommend checking out the latest headlines on trusted news websites.",
                "For news updates, you can visit news websites like BBC, CNN, or Reuters.",
                "I don’t have access to news, but I suggest checking news apps for the latest updates."};
        Que.put(Q10,A10);
        String[]Q11={"Tell me a fun fact", "Do you know any fun facts", "Give me a fun fact", "Tell me something interesting","tell me a fun fact","tell me a funny fact","a funny fact","a fun fact","do you know any fun facts","give me a fun fact","tell me something interesting"};
        String[]A11={  "Did you know? Octopuses have three hearts!",
                "Here’s a fun one: Honey never spoils. Archaeologists have found pots of honey in ancient tombs that are over 3,000 years old!",
                "Here’s something cool: Sloths only poop once a week!",
                "Did you know? The Eiffel Tower can grow by 6 inches during the summer because of thermal expansion!"};
        Que.put(Q11,A11);
        String[]Q12={"What’s your personality", "How would you describe yourself", "What’s your character", "What are you like","what's your personality","how would you describe yourself","what's your character","what are you like"};
        String[]A12={"I’m friendly, helpful, and always here to assist you!",
                "I’m here to help you in the best way I can. I’m friendly and resourceful!",
                "I’m designed to be helpful and responsive, with a positive attitude!",
                "I’m your friendly assistant, always happy to help you out!"};
        Que.put(Q12,A12);
        String[]Q13={"can you motivate me", "give me some motivation", "i need some encouragement", "can you inspire me","give me motivation","can you inspire me","motivate me"};
        String[]A13={ "You’ve got this! Keep pushing forward, success is within reach!",
                "Don’t give up! Every small step is progress. Keep going!",
                "Believe in yourself! Every challenge you face is an opportunity to grow.",
                "You’re doing great! Keep going, and the results will follow!"};
        Que.put(Q13,A13);
        String[]Q14={"What’s your favorite food", "Do you like food?", "What do you like to eat", "Do you have a favorite meal","what's your favorite food","do you like food","what do you like to eat","do you have a favorite meal"};
        String[]A14={"I don’t eat, but I can recommend some delicious food for you!",
                "I don’t have a favorite food, but I’m happy to suggest recipes if you like!",
                "I don’t eat, but I can suggest some tasty dishes for you!",
                "Food is not my thing, but I can certainly help you find a good recipe!"};
        Que.put(Q14,A14);

        String[] Q15={"what's your name","your name","ur name","who are you"};
        String[]A15={"I'm Aco, your virtual assistant.",
                "You can call me Aco, your personal assistant.",
                "My name is Aco. How can I help you today?",
                "I’m Aco, here to assist you!"};
        Que.put(Q15,A15);
        String[]Q16={ "What is JVM",
                "Can you explain the JVM",
                "What does JVM stand for",
                "What is the purpose of the Java Virtual Machine",
                "Why do we need a JVM",
                "How does the JVM work",
                "Tell me about JVM",
                "What role does JVM play in Java",
                "Can you define JVM",
                "How important is the JVM in Java","what is JVM",
                "can you explain the JVM",
                "what does JVM stand for",
                "what is the purpose of the java virtual machine",
                "why do we need a JVM",
                "how does the JVM work",
                "tell me about JVM",
                "what role does JVM play in java",
                "can you define JVM",
                "how important is the JVM in java",
                "jvm"};
        String[]A16={"JVM stands for Java Virtual Machine. It’s a software engine that executes Java bytecode.",
                "The JVM is what makes Java platform-independent by converting bytecode into machine code.",
                "JVM is the runtime environment where Java programs run, handling tasks like memory management and execution.",
                "Java Virtual Machine allows Java programs to run on any device or operating system with a JVM installed.",
                "The JVM is responsible for loading, verifying, and executing Java bytecode.",
                "JVM ensures Java’s portability and handles memory with features like garbage collection.",
                "It’s the core of Java’s 'Write Once, Run Anywhere' capability, translating bytecode to machine instructions.",
                "The JVM abstracts the differences in operating systems, allowing the same Java code to run anywhere.",
                "JVM is an engine that provides a runtime environment for Java applications.",
                "It’s a virtual machine that manages Java program execution, ensuring performance and security."
        };
        Que.put(Q16,A16);



        String[] javaQ1={"What is Java? Why is it called platform-independent?",
                "Can you describe Java and explain its key feature of platform independence?",
                "What makes Java a popular programming language, and how does it achieve platform independence?",
                "Explain Java’s architecture and why it is considered platform-independent.",
                "What does it mean when we say Java is platform-independent?",
                "How does Java’s 'write once, run anywhere' capability work?",
                "Why is Java different from other languages in terms of platform compatibility?",
                "How does the Java Virtual Machine (JVM) contribute to Java’s platform independence?",
                "Explain the role of bytecode in making Java platform-independent.",
                "What is the process of compilation and execution in Java that enables platform independence?",
                "Compare Java’s platform independence with platform dependence in other programming languages.",
                "Why is Java considered more portable than C or C++?",
                "How does Java’s platform independence make it suitable for cross-platform development?",
                "In what scenarios does Java’s platform independence play a crucial role in software development?",
                "describe java",
                "platform independence",
                "what is java",
                "what is Java"

        };
        String[] javaa1={"Java is a versatile, object-oriented programming language used to develop a wide array of applications, from mobile apps to large-scale web systems. Known for being simple, efficient, and scalable, Java's ability to work across multiple platforms is a key feature.\n" +
                "Platform independence in Java allows programs to run on any operating system without changes. This is possible because Java code is compiled into bytecode, which is independent of the underlying system. The bytecode is executed by the JVM, which adapts the code to the specific platform, ensuring seamless execution everywhere.",

                "Java is an object-oriented programming language widely used for developing applications across various platforms, such as web services, mobile devices, and enterprise solutions. It is praised for its simplicity, performance, and adaptability.\n" +
                        "Java achieves platform independence by compiling its source code into bytecode, a standardized format. The Java Virtual Machine (JVM) on each platform interprets this bytecode and runs it as native code on the system, allowing the same Java program to operate on different operating systems without modification.",

                "Java is a robust, high-level programming language that supports object-oriented principles, making it ideal for building software solutions ranging from desktop applications to cloud-based services. Its simplicity, efficiency, and security features have made it one of the most widely used languages.\n" +
                        "The platform-independent nature of Java is attributed to its use of bytecode. When Java code is compiled, it's transformed into bytecode that can be executed by any operating system. The JVM on each platform executes this bytecode, ensuring that Java programs can run on any machine without needing to change the source code.",

                "Java is an object-oriented language used to create diverse applications, from mobile apps to enterprise software. Its simplicity, stability, and platform portability are major reasons for its widespread use.\n" +
                        "Java is platform-independent because it compiles code into bytecode, which is not tied to a particular operating system. The Java Virtual Machine (JVM) on any system reads this bytecode and translates it into native code, allowing the same Java program to run seamlessly across different platforms without needing to be recompiled.",

                "Java is a high-level, object-oriented programming language that's widely used for developing applications across different environments, such as web applications, mobile apps, and enterprise solutions. Java's core features include ease of use, reliability, and portability.\n" +
                        "Platform independence in Java is achieved by compiling the source code into an intermediate form called bytecode. This bytecode is platform-neutral and can be executed on any system with the appropriate Java Virtual Machine (JVM), which interprets the bytecode and adapts it to the system's architecture. This allows Java programs to run on any operating system without modification.",

                "Java is a programming language known for its object-oriented nature and used to develop applications for a variety of platforms. It is particularly praised for its ease of use, portability, and the ability to run on multiple operating systems.\n" +
                        "Java's platform independence comes from its use of bytecode, a low-level code that is not tied to any specific platform. When Java code is compiled, it's converted to bytecode. The Java Virtual Machine (JVM) on each operating system interprets and executes this bytecode, ensuring that Java programs can run seamlessly across any platform without modification."};

        Que.put(javaQ1,javaa1);

        String[]javaQ2= {"Can you list the key features of Java?",
                "What are the most important characteristics of the Java programming language?",
                "What makes Java unique in terms of its features?",
                "What features distinguish Java from other programming languages?",
                "How would you describe the core features of Java that make it popular?",
                "What are the essential features of Java that developers should know?",
                "How do the main features of Java compare to those of other programming languages?",
                "Why are Java’s features beneficial for software development?",
                "What are some of the unique features of Java that set it apart from other languages like C++ or Python?",
                "What are the major technical features of Java that contribute to its reliability and portability?",
                "Can you explain the key features of Java in terms of object-oriented programming?",
                "What features of Java enable it to be platform-independent and secure?",
                "How do Java's main features help in building cross-platform applications?",
                "What features of Java are most advantageous for mobile or web development?"
                ,"features of java"

        };

        String[]javaa2={ "Java is a versatile programming language with several key features that make it a popular choice for developers. Its object-oriented nature promotes modularity and reusability. The platform independence allows Java programs to run across various systems using the Java Virtual Machine (JVM). Java's security features include strong encryption and bytecode verification. Multithreading support enables efficient, concurrent task execution, and automatic garbage collection helps manage memory. Java's robustness, security, and built-in libraries contribute to the development of scalable, reliable, and high-performance applications.",

                "The key features of Java include its object-oriented approach, which enhances code reusability and maintainability. Java is platform-independent due to its compilation into bytecode, which runs on any system with a JVM. It has built-in security features like access control and bytecode verification. Multithreading allows for efficient task handling, while automatic memory management through garbage collection reduces memory leaks. Java's rich API simplifies development, and its robust exception handling and error management ensure reliability and stability in software applications.",

                "Java boasts several essential features that contribute to its widespread adoption: \n" +
                        "1. Object-Oriented: Supports OOP principles like inheritance, polymorphism, and encapsulation.\n" +
                        "2. Portability: 'Write once, run anywhere' is achieved via bytecode and JVM.\n" +
                        "3. Security: Java includes features to protect against malicious threats and errors.\n" +
                        "4. Multithreading: Java supports running multiple tasks simultaneously.\n" +
                        "5. Garbage Collection: Automatic memory management helps in efficient resource usage.\n" +
                        "6. Robustness: Java’s strong error-handling and type-checking make it reliable.",

                "Java's core features include object-oriented programming, which helps create reusable and modular code. It is platform-independent because Java programs are compiled into bytecode that runs on the JVM. Its security model prevents unauthorized access and threats. Java supports multithreading for efficient execution of concurrent tasks and includes automatic garbage collection for memory management. Additionally, Java is designed to be robust with strong exception handling and built-in error checking. Java’s rich API makes it easy to develop applications for various purposes.",

                "Java is known for several features that make it a preferred programming language. These include:\n" +
                        "1. Object-Oriented: Everything is treated as objects, enabling modular and reusable code.\n" +
                        "2. Platform Independence: Java’s bytecode allows it to run on any platform with a JVM, providing portability.\n" +
                        "3. Security: Java has built-in security features like bytecode verification and access control.\n" +
                        "4. Multithreading: Java supports multithreading, allowing efficient execution of multiple processes.\n" +
                        "5. Automatic Garbage Collection: Java takes care of memory management automatically, freeing unused objects.\n" +
                        "These features collectively make Java a powerful and reliable language for various applications.",

                "Java's main features are what set it apart from many other programming languages. It’s an object-oriented language, making it easier to design and manage large-scale applications. Java is also platform-independent due to its use of bytecode that runs on the JVM, ensuring portability. The language provides strong security mechanisms, such as access controls and encryption. Java's multithreading capabilities enable efficient concurrent processing, and its garbage collection feature ensures efficient memory management. With a robust API and a focus on performance, Java is well-suited for developing both small and enterprise-level applications."};

        Que.put(javaQ2,javaa2);
        String[] javaQ3={"Can you explain the difference between JDK, JRE, and JVM?",
                "What is the distinction between JDK, JRE, and JVM?",
                "How do JDK, JRE, and JVM work together, and what distinguishes them?",
                "Can you provide an overview of the differences between JDK, JRE, and JVM?",
                "What is the relationship between JDK, JRE, and JVM, and how do they differ?"
                ,"jdk,jre,jvm"};
        String[]javaa3={  "JDK (Java Development Kit) is a complete software development kit used to develop Java applications. It includes the JRE (Java Runtime Environment), along with development tools like compilers and debuggers for building Java programs. \n" +
                "JRE (Java Runtime Environment) is a package that provides the libraries, Java Virtual Machine (JVM), and other components necessary to run Java applications. It does not include development tools like compilers.\n" +
                "JVM (Java Virtual Machine) is an abstract computing machine that enables Java applications to run. It converts bytecode into native machine code, making Java platform-independent.",

                "The JDK (Java Development Kit) is the complete environment for developing Java applications. It includes the JRE (Java Runtime Environment) along with the necessary tools for compiling, debugging, and running Java code.\n" +
                        "The JRE (Java Runtime Environment) provides the necessary libraries and JVM for running Java applications. It doesn't have the development tools that JDK provides.\n" +
                        "The JVM (Java Virtual Machine) is the engine that executes Java bytecode, translating it to machine-specific code, enabling platform independence of Java applications.",

                "JDK stands for Java Development Kit and is a software package used for creating Java applications. It includes the JRE and additional development tools like compilers and debuggers.\n" +
                        "JRE (Java Runtime Environment) is used to run Java programs, containing the JVM and class libraries needed for execution but without development tools.\n" +
                        "JVM (Java Virtual Machine) is the part of the JRE responsible for executing the bytecode and converting it into machine-specific code for the underlying system.",

                "JDK (Java Development Kit) is a full-featured software development kit for building Java applications, including tools like the Java compiler, debugger, and JRE.\n" +
                        "JRE (Java Runtime Environment) includes the JVM and class libraries required for running Java programs but doesn't contain tools for compiling code.\n" +
                        "JVM (Java Virtual Machine) is the component that runs Java bytecode and ensures that Java programs can run on any device with a JVM.",

                "The JDK (Java Development Kit) is a comprehensive development toolkit that includes all necessary tools to write, compile, debug, and run Java applications. It contains the JRE and additional development tools.\n" +
                        "JRE (Java Runtime Environment) is used for running Java applications and includes the JVM and essential libraries but lacks the tools for development.\n" +
                        "JVM (Java Virtual Machine) is a virtual machine responsible for executing Java bytecode by translating it into machine code for specific platforms.",

                "JDK (Java Development Kit) is used by developers to create Java programs and includes both the JRE and tools like compilers and debuggers for Java development.\n" +
                        "JRE (Java Runtime Environment) provides the environment to run Java programs, containing the JVM and necessary class libraries, but doesn't have the development tools.\n" +
                        "JVM (Java Virtual Machine) executes Java bytecode, enabling platform independence by converting it into machine-specific instructions."};
        Que.put(javaQ3,javaa3);
        String[] javaQ4={  "What is the role of a Java Virtual Machine (JVM)? How does it operate?",
                "Can you explain how the Java Virtual Machine (JVM) works?",
                "How does the JVM (Java Virtual Machine) enable Java applications to run on different platforms?",
                "What is the function of JVM in Java programming, and how does it execute bytecode?",
                "What is JVM, and how does it translate Java bytecode to machine-specific code?",
                "How does the Java Virtual Machine (JVM) ensure that Java is platform-independent?",
                "Can you explain the inner workings of the JVM and its role in Java application execution?"
                ,"jvm"};
        String[] javaa4={"A Java Virtual Machine (JVM) is an abstract computing machine that enables Java programs to run on any platform without modification. The JVM interprets Java bytecode, which is platform-independent, and executes it as machine-specific code. This process allows Java to follow its 'Write Once, Run Anywhere' principle. The JVM consists of a class loader to load the bytecode, an execution engine to run it, and a garbage collector for memory management.",

                "The Java Virtual Machine (JVM) is a virtual environment that enables the execution of Java bytecode. It translates bytecode into machine code that the host system can execute, making Java platform-independent. The JVM's class loader loads Java classes into memory, and the execution engine runs the bytecode. Additionally, the JVM uses Just-In-Time (JIT) compilation for faster performance and a garbage collector to manage memory.",

                "A Java Virtual Machine (JVM) is responsible for executing Java programs by converting Java bytecode into native machine code that can be understood by the host system. The JVM abstracts the underlying hardware, allowing Java to run on any device with a compatible JVM installed. The process starts by compiling Java source code into bytecode, which is then loaded by the class loader and executed by the JVM’s execution engine.",

                "The JVM is an abstract computing machine that enables the execution of Java applications across multiple platforms. It takes Java bytecode and interprets it into machine-specific instructions using the execution engine. The JVM performs just-in-time (JIT) compilation to improve performance and includes a garbage collector to free up memory. The JVM’s ability to work independently of the operating system ensures Java's portability.",

                "A Java Virtual Machine (JVM) serves as a bridge between Java bytecode and the machine code of the underlying platform. It allows Java programs to run on any operating system, making Java platform-independent. The JVM loads Java classes into memory, executes the bytecode, and manages memory via garbage collection. By translating bytecode into machine code, the JVM ensures that Java applications can run on any device with a JVM.",

                "The Java Virtual Machine (JVM) is a crucial component in the Java ecosystem. It allows Java applications to be executed on any platform by interpreting platform-independent bytecode into platform-specific machine code. The JVM consists of a class loader that loads bytecode, an execution engine that runs the bytecode, and a garbage collector that automatically manages memory. The JVM's ability to run Java bytecode on any platform is what makes Java truly portable."};
        Que.put(javaQ4,javaa4);
        String[] javaQ5={"What is a class and an object in Java?",
                "How do you define a class and create objects in Java?",
                "What is the relationship between a class and an object in Java?",
                "Can you explain the difference between a class and an object in Java?",
                "What are class and object in Java, and how do they work?",
                "object in java"};
        String[] javaa5={  "In Java, a class is a blueprint or template that defines the structure and behavior of objects. An object is an instance of a class, representing a real-world entity with specific values. A class defines the attributes (fields) and behaviors (methods) that the object will have.",
                "A class in Java is a blueprint for creating objects, defining their properties and behaviors. An object is an instance of that class. It contains real values assigned to the fields defined in the class.",
                "In Java, a class is the definition of the properties and behaviors of objects, while an object is an instantiation of a class. For example, a class can represent a car, and an object would be a specific car like 'Honda Civic'.",
                "A class in Java serves as a blueprint for creating objects. It defines the methods and attributes an object will have. When an object is created from a class, it is referred to as an instance of that class."};
        Que.put(javaQ5,javaa5);
        String[]javaQ6={ "What are the default values of data types in Java?",
                "Can you explain the default values of primitive types in Java?",
                "What are the default values for variables in Java?",
                "How are variables initialized in Java by default?",
                "default values in java"};
        String[]javaa6={        "In Java, variables have default values depending on their data types. For example, numeric types (like int, float) default to 0, boolean variables default to false, and object references default to null.",
                "The default values for primitive data types in Java are 0 for numeric types, false for boolean, and null for object references. This ensures that uninitialized variables still have some meaningful value.",
                "Primitive data types in Java have default values: numeric types are set to 0, boolean is false, and references to objects are set to null, preventing errors when accessing uninitialized variables.",
                "In Java, variables are automatically assigned default values when declared. For primitive types, this means 0 for numbers, false for booleans, and null for references. This ensures variables are never left undefined."};
        Que.put(javaQ6,javaa6);
        String[]javaQ7={"Explain the concept of OOP (Object-Oriented Programming). What are its main principles?",
                "What is Object-Oriented Programming (OOP)? Can you describe its principles?",
                "How does OOP differ from procedural programming, and what are its basic principles?",
                "What are the key principles of OOP and how do they relate to Java?",
                "oop","object oriented programming"};
        String[]javaa7={     "Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which contain both data and methods. The four main principles of OOP are Encapsulation, Abstraction, Inheritance, and Polymorphism.",
                "OOP in Java is a paradigm based on objects that represent real-world entities. It focuses on principles like Encapsulation (data hiding), Abstraction (hiding complexity), Inheritance (reusing code), and Polymorphism (object behavior flexibility).",
                "OOP is a methodology where programs are structured as a collection of objects. It uses four core principles: Encapsulation (bundling data and methods), Abstraction (hiding details), Inheritance (reusing code), and Polymorphism (allowing objects to take multiple forms).",
                "The main principles of OOP are Encapsulation (hiding data inside classes), Inheritance (sharing code between classes), Polymorphism (object behavior flexibility), and Abstraction (simplifying complex systems). These principles help create modular and maintainable Java programs."};
        Que.put(javaQ7,javaa7);
        String[]javaQ8={ "Write a simple Java program to print 'Hello, World!'",
                "How do you print 'Hello, World!' in Java?",
                "Can you provide a basic Java program to display 'Hello, World!'?",
                "How would you write a Java program to print 'Hello, World!' on the screen?",
                "Hello ,World! in java ",
                "Hello world in java",
                "hello world in java"};
        String[]javaa8={"Here is a simple Java program that prints 'Hello, World!':\n\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println('Hello, World!');\n" +
                "    }\n" +
                "}",

                "The following code will print 'Hello, World!' in Java:\n\n" +
                        "public class HelloWorld {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println('Hello, World!');\n" +
                        "    }\n" +
                        "}",

                "To print 'Hello, World!' in Java, use the following code:\n\n" +
                        "public class HelloWorld {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println('Hello, World!');\n" +
                        "    }\n" +
                        "}",

                "Here is a basic Java program to display 'Hello, World!':\n\n" +
                        "public class HelloWorld {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println('Hello, World!');\n" +
                        "    }\n" +
                        "}"
        };
        Que.put(javaQ8,javaa8);
        String[]javaQ9={        "What is the difference between public, private, protected, and default access modifiers?",
                "Can you explain the difference between public, private, protected, and default access modifiers in Java?",
                "How do the access modifiers differ from each other in Java?",
                "What is the purpose of using public, private, protected, and default modifiers in Java?",
                "What does each of the access modifiers (public, private, protected, default) mean?"
                ,"public ,private ,protected ,default in java"
        };
        String[]javaa9={ "In Java, access modifiers control the visibility of classes, methods, and variables. 'Public' allows access from any class, 'private' restricts access to the class itself, 'protected' allows access within the class, subclass, and the same package, and 'default' allows access within the same package.",
                "Public members can be accessed from any class, private members are restricted to the class, protected members can be accessed by subclasses and classes in the same package, and default members are visible within the same package.",
                "Public means universal access, private restricts access to the class, protected allows access to subclasses and classes in the same package, and default allows access to classes in the same package.",
                "Public grants universal access, private restricts to the class, protected allows access to subclasses and within the same package, and default provides package-level access.",
                "Public gives access to all classes, private restricts access to the class itself, protected allows access in the same package and subclasses, and default allows access within the same package."};
        Que.put(javaQ9,javaa9);
        String[]javaQ10={  "Explain the difference between == and equals() in Java?",
                "What is the difference between == and equals() in Java?",
                "When should we use '==' and when should we use 'equals()' in Java?",
                "How does the '==' operator differ from the equals() method in Java?",
                "What are the uses of '==' and equals() in Java?",
                "between == and equals in java"};
        String[]javaa10={    "In Java, '==' is used to compare references (memory addresses) of objects, while 'equals()' is a method that compares the content or values of objects. '==' checks if both variables point to the same object in memory, while 'equals()' compares the actual contents of the objects.",
                "The '==' operator compares references (whether both variables point to the same memory address), while the 'equals()' method compares the actual data or content within the objects.",
                "Use '==' for primitive types and to check if two references point to the same object. Use 'equals()' when comparing the contents of two objects, especially for classes like String, which override the equals method.",
                "The '==' operator compares the reference of two objects (whether they refer to the same object), while equals() compares the content or state of two objects (i.e., their actual values).",
                "'==' compares the memory location of two objects, whereas equals() compares their actual content. Use '==' for primitives, and equals() when comparing object content."};
        Que.put(javaQ10,javaa10);




    }



}
