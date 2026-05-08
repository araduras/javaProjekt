import java.util.ArrayList;
import java.util.List;

class PhoneNumber {
        List<Integer> phoneNumberList = new ArrayList<>();
        String phoneNumberString = "";

    PhoneNumber(String numberString) {

    }

    String getNumber() {
        
    }

    void phoneNumberStringBuilder(){
        for (int i = 0; i < phoneNumberList.size(); i++) {
            phoneNumberString.concat(String.valueOf(phoneNumberList.get(i)));
        }
    }

    

    void phoneNumberListBuilder(String numberString) {
        for (int i = 0; i < numberString.length(); i++) {
            // NXX NXX XXXX
            // ("[2-9]\\d\\d[2-9]\\d\\d\\d\\d\\d\\d")
            if (numberString.substring(i, i + 1).matches("\\d)")) {
                phoneNumberList.add(Integer.valueOf(numberString.substring(i, i + 1)));
            }

        }
    }

}