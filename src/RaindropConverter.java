    class RaindropConverter {

        String convert(int number) {
            String returnString = "";
            if(number%3==0){
                returnString = returnString.concat("Pling");
            }
            if(number%5==0){
                 returnString = returnString.concat("Plang");
            }
            if(number%7==0){
                 returnString = returnString.concat("Plong");
            }

            if(returnString.length()==0){
            return returnString+(Integer.valueOf(number));
            }
            return returnString;
            

        }

    }
