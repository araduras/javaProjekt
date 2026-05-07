    import java.util.ArrayList;
    import java.util.List;

    class Bob {
    List<String> sentence = new ArrayList<>();
    List<String> upperCaseSentence = new ArrayList<>();
    List<Character> withoutWhiteSpace = new ArrayList<>();
        String hey(String input) {
        listCreator(input);
        
            if(sentence.getLast()=="?" && sentence.equals(upperCaseSentence)){
                return determiner("CAPITAL QUESTION");
            }
            else if (sentence.getLast().equals("?")){
                return determiner("?");
            }
            else if (sentence.equals(upperCaseSentence)){
                return determiner("CAPITAL");
            }
            else if (withoutWhiteSpace.isEmpty()){
                   return determiner("whitespace");
            }
            else {
                return determiner("Whatever.");
            }
            

        }

    void listCreator (String input){

            for (int i = 0; i < input.length(); i++) {
                sentence.add(input.substring(i, i+1));
            }
            for (int i = 0; i < input.length(); i++) {
                upperCaseSentence.add(input.substring(i, i+1).toUpperCase());
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(!Character.isWhitespace(c)){
                        withoutWhiteSpace.add(c);
                }
                
                
            }
            

    }

        String determiner(String s){

            switch (s){
                case "?" : {return "Sure.";}
                case "CAPITAL" : {return "Whoa, chill out!";}
                case "CAPITAL QUESTION" : {return "Calm down, I know what I'm doing!";}
                case "whitespace" : {return "Fine. Be that way!";}
                default : return "Whatever.";
            }
        }
    }