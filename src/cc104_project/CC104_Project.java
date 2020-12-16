/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc104_project;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author My PC
 */
public class CC104_Project {
    public static SList<String> technology = new SList<>();
    public static SList<String> english = new SList<>();
    public static SList<String> math = new SList<>();
    public static SList<String> science = new SList<>();
    public static SList<String> filipino = new SList<>();
    Console c = System.console();
    
    // subject.addQuestionAndAnswer("Label", "Question", "Answer");
    // subject.addMultipleChoice("Lebel", "Question", "Answer", "Choice2", "Choice3", "Choice4");
    
    public void setTechnology() {
        technology.addQuestionAndAnswer("Question Number 1",
                "Solar power generates electricity from what source?", // Question
                "The Sun"); // Answer
        technology.addQuestionAndAnswer("Question Number 2",
                "Did the Apple iPhone first become available in 2005, 2006 or 2007?", // Question
                "2007"); // Answer
        technology.addQuestionAndAnswer("Question Number 3",
                "In terms of computing, what does CPU stand for?", // Question
                "Central Processing Unit"); // Answer
        technology.addQuestionAndAnswer("Question Number 4",
                "True or false? Nintendo was founded after the year 1900.", // Question
                "False"); // It was 1889 // Answer
        technology.addQuestionAndAnswer("Question Number 5",
                "The Hubble Space Telescope is named after which American astronomer?", // Question
                "Edwin Hubble"); // Answer
        technology.addQuestionAndAnswer("Question Number 6",
                "Is the wavelength of infrared light too long or short to be seen by humans?", // Question
                "Long"); // Answer
        technology.addQuestionAndAnswer("Question Number 7",
                "Firefox, Opera, Chrome, Safari and Explorer are types of what?", // Question
                "Web Browsers"); // Answer
        technology.addQuestionAndAnswer("Question Number 8",
                "True or false? Gold is not a good conductor of electricity?", // Question
                "False"); // Answer
        technology.addQuestionAndAnswer("Question Number 9",
                "The technologically advanced humanoid robot ASIMO is made by which car company?", // Question
                "Honda"); // Answer
        technology.addQuestionAndAnswer("Question Number 10",
                "True or false? Atomic bombs work by atomic fission.", // Question
                "True"); // Answer
        technology.addQuestionAndAnswer("Question Number 11",
                "In terms of computing, what does ROM stand for?", // Question
                "Read Only Memory"); // Answer
        technology.addQuestionAndAnswer("Question Number 12",
                "Did the original Sony Playstation use CDs or cartridges to play games?", // Question
                "CDs"); // Answer
        technology.addQuestionAndAnswer("Question Number 13",
                "What is the Earth’s primary source of energy?", // Question
                "The Sun"); // Answer
        technology.addQuestionAndAnswer("Question Number 14",
                "IBM is a well known computer and information technology company, what does IBM stand for?", // Question
                "International Business Machines"); // Answer
        technology.addQuestionAndAnswer("Question Number 15",
                "Along with whom did Bill Gates found Microsoft?", // Question
                "Paul Allen"); // Answer
        technology.addQuestionAndAnswer("Question Number 16",
                "What science fiction writer wrote the three laws of robotics?", // Question
                "Isaac Asimov"); // Answer
        technology.addQuestionAndAnswer("Question Number 17",
                "True or false? In computing, keyboards are used as input devices.", // Question
                "True"); // Answer
        technology.addQuestionAndAnswer("Question Number 18",
                "What does the abbreviation WWW stand for?", // Question
                "World Wide Web"); // Answer
        technology.addQuestionAndAnswer("Question Number 19",
                "Nano, Shuffle, Classic and Touch are variations of what? ", // Question
                "Ipod"); // Answer
        technology.addQuestionAndAnswer("Question Number 20",
                "True or false? DNA is an abbreviation for ‘Deoxyribonucleic acid’.", // Question
                "True"); // Answer
    }
    
    public void setEnglish() {
        english.addMultipleChoice("Question Number 1",
                "It is a word used as the name of a person, place or thing.", // Question
                "Nouns", // Answer
                "Pronouns", "Verbs", "Adjectives"); // Other Choices
        english.addMultipleChoice("Question Number 2",
                "The words ‘a’, ‘an’ and ‘the’ are called?", // Question
                "Articles", // Answer
                "Nouns", "Adjectives", "Pronouns"); // Other Choices
        english.addMultipleChoice("Question Number 3",
                "It is a word which modifies the meaning of a verb, adjective or another adverb.", // Question
                "Adjectives", // Answer
                "Pronouns", "Articles", "Adverbs"); // Other Choices
        english.addMultipleChoice("Question Number 4",
                "I ____ tennis every Sunday morning.", // Question
                "play", // Answer
                "am playing", "playing", "am play"); // Other Choices
        english.addMultipleChoice("Question Number 5",
                "Sorry, she can't come to the phone. She _____ a bath!", // Question
                "is having", // Answer
                "has", "having", "have"); // Other Choices
        english.addMultipleChoice("Question Number 6",
                "I've just finished reading a story called Dangerous Game. It's about a man who _____ his wife because he doesn't want to lose her.", // Question
                "kills", // Answer
                "killed", "kill", "is killing"); // Other Choices
        english.addMultipleChoice("Question Number 7",
                "The phone _______. Can you answer it, please?", // Question
                "is ringing", // Answer
                "rings", "ring", "rang"); // Other Choices
        english.addMultipleChoice("Question Number 8",
                "It is a word which shows the relation between the noun or pronoun and other words in the sentence.", // Question
                "Prepositions", // Answer
                "Conjunctions", "Interjections", "Adverbs"); // Other Choices
        english.addMultipleChoice("Question Number 9",
                "It is a word which expresses sudden feeling or emotion.", // Question
                "Interjections", // Answer
                "Conjunctions", "Adjectives", "Pronouns"); // Other Choices
        english.addMultipleChoice("Question Number 10",
                "It is a word which joins two sentences to complete their meaning.", // Question
                "Conjunctions", // Answer
                "Pronouns", "Nouns", "Verbs"); // Other Choices
    }
    
    public void setMath() {
        math.addMultipleChoice("Question Number 1",
                "What is greater than 4?", // Question
                "5", // Answer
                "-5", "-1/2", "-25"); // Other Choices
        math.addMultipleChoice("Question Number 2",
                "Which is the smallest?", // Question
                "-1", // Answer
                "-1/2", "0", "3"); // Other Choices
        math.addMultipleChoice("Question Number 3",
                "Combine terms: 12a + 26b -4b – 16a.", // Question
                "-4a + 22b", // Answer
                "4a+22b", "-28a + 30b", "28a + 30b"); // Other Choices
        math.addMultipleChoice("Question Number 4",
                "Simplify: (4 – 5) – (13 – 18 + 2).", // Question
                "2", // Answer
                "-1", "-2", "1"); // Other Choices
        math.addMultipleChoice("Question Number 5",
                "What is |-26|?", // Question
                "26", // Answer
                "-26", "0", "1"); // Other Choices
        math.addMultipleChoice("Question Number 6",
                "Multiply: (x – 4)(x + 5).", // Question
                "x2 + x - 20", // Answer
                "x2 + 5x - 20", "x2 - 4x - 20", "x2 - x - 20"); // Other Choices
        math.addMultipleChoice("Question Number 7",
                "Factor: 5x2 – 15x – 20.", // Question
                "5(x-4)(x+1)", // Answer
                "-2(x-4)(x+5)", "-5(x+4)(x-1)", "5(x+4)(x+1)"); // Other Choices
        math.addMultipleChoice("Question Number 8",
                "Factor: 3y(x – 3) -2(x – 3).", // Question
                "(x – 3)(3y – 2)", // Answer
                "(x – 3)(x – 3)", "(x – 3)2", "3y(x – 3)"); // Other Choices
        math.addMultipleChoice("Quesrion Number 9",
                "Solve for x: 2x – y = (3/4)x + 6.", // Question
                "4(y + 6)/5", // Answer
                "(y + 6)/5", "(y + 6)", "4(y - 6)/5"); // Other Choices
        math.addMultipleChoice("Question Number 10",
                "Simplify:(4x2 - 2x) - (-5x2 - 8x).", // Question
                "3x(3x + 2)", // Answer
                "Choice2", "Choice3", "Choice4"); // Other Choices
    }
    
    public void setScience() {
        science.addQuestionAndAnswer("Question Number 1",
                "The scientific study of plants is known as what?", // Question
                "Botany"); // Answer
        science.addQuestionAndAnswer("Question Number 2",
                "The process of plants using energy from sunlight to turn carbon dioxide into food is known as what?", // Question
                "Photosynthesis"); // Answer
        science.addQuestionAndAnswer("Question Number 3",
                "True or false? In right conditions bamboo can grow over 60cm(24in) in just one day.", // Question
                "True"); // Answer
        science.addQuestionAndAnswer("Question Number 4",
                "The movement of polen from anther to stigma of a flower is know as what?", // Question
                "Pollination"); // Answer
        science.addQuestionAndAnswer("Question Number 5",
                "Amber is made from fossilized tree_____?", // Question
                "Resin"); // Answer
        science.addQuestionAndAnswer("Question Number 6",
                "True or false? Humans were on Earth before plants?", // Question
                "False"); // Answer
        science.addQuestionAndAnswer("Question Number 7",
                "What grain has the highest level of worldwide production?(Hint: Rice is second)", // Question
                "Maize"); // Answer
        science.addQuestionAndAnswer("Question Number 8",
                "A trailing or a climbing plant is also known as_____?", // Question
                "Vine"); // Answer
        science.addQuestionAndAnswer("Question Number 9",
                "True or false? Pitcher plants are carnivorous.", // Question
                "True"); // Answer
        science.addQuestionAndAnswer("Question Number 10",
                "The Japanese word 'sakura' means the blossiming of what kind of tree?", // Question
                "Cherry Tree"); // Answer
    }
    
    public void setFilipino() {
        filipino.addMultipleChoice("Question Number 1",
                "Ano ang pambansang wika natin?", // Question
                "Filipino", // Answer
                "Cebuano", "Tagalog", "Ingles"); // Other Choices
        filipino.addMultipleChoice("Question Number 2",
                "Mga salitang pantawag sa tao, bagay, hayop, lunan at kaganapan.", // Question
                "Pangngalan", // Answer
                "Panghalip", "Pamatlig", "Panaguri"); // Other Choices
        filipino.addMultipleChoice("Question Number 3",
                "Ang tulang itong ay patungkol sa kamatayan o pagdadalamhati lalo na sa paggunita sa isang sumakabilang-buhay na.", // Question
                "Elihiya", // Answer
                "Komedya", "Pastoral", "Oda"); // Other Choices
        filipino.addMultipleChoice("Question Number 4",
                "Ito ay nagsasaad ng kilos na ginagawa pa lamang.", // Question
                "Imperpektibo", // Answer
                "Kontemplatibo", "Perpektibo", "Pnadiwa"); // Other Choices
        filipino.addMultipleChoice("Question Number 5",
                "Isang maikling kwentong may aral na kalimitang hinahango mula sa bibliya.", // Question
                "Parabula", // Answer
                "Pabula", "Salawikain", "Sawikain"); // Other Choices
        filipino.addMultipleChoice("Question Number 6",
                "Kailan nagsimula ang buwan ng wika?", // Question
                "1935", // Answer
                "1937", "1934", "1936"); // Other Choices
        filipino.addMultipleChoice("Question Number 7",
                "Ang salitang yamang-dagat ay _____.", // Question
                "Tambalan", // Answer
                "Inuulit", "Maylpi", "Paypak"); // Other Choices
        filipino.addMultipleChoice("Question Number 8",
                "Ito ang anyo ng panitikan na naglalayong mabigyang-kasagutan ang pinagmulang mga bagay, pook, pangyayari, o katawagan bagama't mahiwaga at hindi kapani-paniwala ang nilalaman ay kasasalaminan ng kultura ng rehiyong pinagmulan.", // Question
                "Alamat", // Answer
                "Pabula", "Salawikain", "Epiko"); // Other Choices
        filipino.addMultipleChoice("Question Number 9",
                "Ang inihahayag na damdam ay matutukoy sa pamamagitan ng:", // Question
                "Ekspresyon ng mukha", // Answer
                "Kumpas ng kamay", "Tono o intonasyon", "Malim ng mga salitang binigkas"); // Other Choices
        filipino.addMultipleChoice("Question Number 10",
                "Isang uri ng panitikan na ang mga pangunahing tauhan ay mga hayop na mula sa imahinasyon ng manunulat na siyang kinagigiliwan at kinapupulutan ng aral ng mga kabataan.", // Question
                "Pabula", // Answer
                "Alamat", "Salawikain", "Epiko"); // Other Choices
    }
    
    /*
    Only these if Question and Answer
    The (getData1) is the Number of the Question
    The (getData2) is the Question
    The (getData3) is the Answer
    
    Additional if Multiple Choice
    The (getData4) is the Choice2
    The (getData5) is the Choice3
    The (getData6) is the Choice4
    */
    
    // Technology is Question and Answer
    // English is Multiple Choice
    // Math is Multiple Choice
    // Science is Question and Answer
    // Filipino is Multiple Choice
    
    // QandA is Question and Answer
    // MC is Multiple Choice
    
    public void technologyQandA() {
        int score = 0;
        int number = 0;
        while(!technology.isEmpty()) { // Dont stop until it is Empty
            number++;
            Node<String> t = technology.getNode(); // It will get and delete a Node
            String question = t.getData2();
            String answer = t.getData3();
            
            String ans = JOptionPane.showInputDialog(null, question, "QandA No." + number, JOptionPane.PLAIN_MESSAGE);
            if (ans == null) {
                JOptionPane.showMessageDialog(null, "Canceled", "Canceled", JOptionPane.PLAIN_MESSAGE);
                while(!technology.isEmpty()) {
                    technology.getNode();
                }
                break;
            }
            else if (ans.toLowerCase().equals(answer.toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Correct", "Your answer is", JOptionPane.PLAIN_MESSAGE);
                score++;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong", "Your answer is", JOptionPane.PLAIN_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Score: " + score + "/" + number, "Score", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void englishMC() {
        int score = 0;
        int number = 0;
        while(!english.isEmpty()) { // Dont stop until it is Empty
            number++;
            Node<String> e = english.getNode(); // It will get and delete a Node
            String question = e.getData2();
            String answer = e.getData3();
            String choice2 = e.getData4(); 
            String choice3 = e.getData5();
            String choice4 = e.getData6();
            
            ArrayList<String> randAns = getRandAns(answer, choice2, choice3, choice4);
            String ans = JOptionPane.showInputDialog(null,
                    question +"\n" + randAns.get(1) + "\n" + randAns.get(2) + "\n" + randAns.get(3) + "\n" + randAns.get(4),
                    "QandA No." + number, JOptionPane.PLAIN_MESSAGE);
            if (ans == null) {
                JOptionPane.showMessageDialog(null, "Canceled", "Canceled", JOptionPane.PLAIN_MESSAGE);
                while(!english.isEmpty()) {
                    english.getNode();
                }
                break;
            }
            else if (ans.toLowerCase().equals(randAns.get(0).toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Correct", "Your answer is", JOptionPane.PLAIN_MESSAGE);
                score++;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong", "Your answer is", JOptionPane.PLAIN_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Score: " + score + "/" + number, "Score", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void mathMC() {
        int score = 0;
        int number = 0;
        while(!math.isEmpty()) { // Dont stop until it is Empty
            number++;
            Node<String> m = math.getNode(); // It will get and delete a Node
            String question = m.getData2();
            String answer = m.getData3();
            String choice2 = m.getData4(); 
            String choice3 = m.getData5();
            String choice4 = m.getData6();
            
            ArrayList<String> randAns = getRandAns(answer, choice2, choice3, choice4);
            String ans = JOptionPane.showInputDialog(null,
                    question +"\n" + randAns.get(1) + "\n" + randAns.get(2) + "\n" + randAns.get(3) + "\n" + randAns.get(4),
                    "QandA No." + number, JOptionPane.PLAIN_MESSAGE);
            if (ans == null) {
                JOptionPane.showMessageDialog(null, "Canceled", "Canceled", JOptionPane.PLAIN_MESSAGE);
                while(!math.isEmpty()) {
                    math.getNode();
                }
                break;
            }
            else if (ans.toLowerCase().equals(randAns.get(0).toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Correct", "Your answer is", JOptionPane.PLAIN_MESSAGE);
                score++;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong", "Your answer is", JOptionPane.PLAIN_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Score: " + score + "/" + number, "Score", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void scienceQandA() {
        int score = 0;
        int number = 0;
        while(!science.isEmpty()) { // Dont stop until it is Empty
            number++;
            Node<String> s = science.getNode(); // It will get and delete a Node
            String question = s.getData2();
            String answer = s.getData3();
            
            String ans = JOptionPane.showInputDialog(null, question, "QandA No." + number, JOptionPane.PLAIN_MESSAGE);
            if (ans == null) {
                JOptionPane.showMessageDialog(null, "Canceled", "Canceled", JOptionPane.PLAIN_MESSAGE);
                while(!science.isEmpty()) {
                    science.getNode();
                }
                break;
            }
            else if (ans.toLowerCase().equals(answer.toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Correct", "Your answer is", JOptionPane.PLAIN_MESSAGE);
                score++;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong", "Your answer is", JOptionPane.PLAIN_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Score: " + score + "/" + number, "Score", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void filipinoMC() {
        int score = 0;
        int number = 0;
        while(!filipino.isEmpty()) { // Dont stop until it is Empty
            number++;
            Node<String> f = filipino.getNode(); // It will get and delete a Node
            String question = f.getData2();
            String answer = f.getData3();
            String choice2 = f.getData4(); 
            String choice3 = f.getData5();
            String choice4 = f.getData6();
            
            ArrayList<String> randAns = getRandAns(answer, choice2, choice3, choice4);
            String ans = JOptionPane.showInputDialog(null,
                    question +"\n" + randAns.get(1) + "\n" + randAns.get(2) + "\n" + randAns.get(3) + "\n" + randAns.get(4),
                    "QandA No." + number, JOptionPane.PLAIN_MESSAGE);
            if (ans == null) {
                JOptionPane.showMessageDialog(null, "Canceled", "Canceled", JOptionPane.PLAIN_MESSAGE);
                while(!filipino.isEmpty()) {
                    filipino.getNode();
                }
                break;
            }
            else if (ans.toLowerCase().equals(randAns.get(0).toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Correct", "Your answer is", JOptionPane.PLAIN_MESSAGE);
                score++;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong", "Your answer is", JOptionPane.PLAIN_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Score: " + score + "/" + number, "Score", JOptionPane.PLAIN_MESSAGE);
    }
    
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        
        CC104_Project cc104 = new CC104_Project();
        
        // Add the Questions and Answers
        cc104.setTechnology();
        cc104.setEnglish();
        cc104.setMath();
        cc104.setScience();
        cc104.setFilipino();
        
        
        
        // Start of the Question and Answer game
        cc104.technologyQandA();
        //cc104.englishMC();
        //cc104.mathMC();
        //cc104.scienceQandA();
        //cc104.filipinoMC();
        // The rest is still not inlude
        // The reason is it is still being tested
        
    }
    */
    
    public ArrayList<String> getRandAns(String a, String b, String c, String d) {
        ArrayList<String> rtn = new ArrayList<>();
        ArrayList<String> choices = new ArrayList<>();
        choices.add(a);
        choices.add(b);
        choices.add(c);
        choices.add(d);
        Collections.shuffle(choices);
        ArrayList<String> letter = new ArrayList<>();
        letter.add("a");
        letter.add("b");
        letter.add("c");
        letter.add("d");
        for (int j = 0; j < choices.size(); j++) {
            if (choices.get(j).equals(a)) {
                rtn.add(letter.get(j));
            }
        }
        for (int j = 0; j < choices.size(); j++) {
            rtn.add(letter.get(j) + ". " + choices.get(j));
        }
        
        return rtn;
    }
    
}
