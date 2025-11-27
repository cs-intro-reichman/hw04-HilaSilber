public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }


    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String sen;
        boolean flag;
        for (int i = 0; i < sentences.length; i++){
            flag = false;
            sen = sentences[i];
            sen = sen.toLowerCase();
            sen = sen.replaceAll("[^a-z ]", "");
            String[] words = sen.split(" ");

            for (String k : keywords){
                String kLower = k.toLowerCase();
                for (String word : words){
                    if (word.equals(kLower)){
                        flag = true;
                        System.out.println(sentences[i]);
                        break;
                    }
                if (flag){
                    break;
                }
            
            }

                 
            }
        }
    }
}

