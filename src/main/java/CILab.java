public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString.equals("")){
            return false;
        }

        int length = myString.length();
        int count = 0;
        if (Character.isUpperCase(myString.charAt(0))){
            count++;
            for (int i = 1; i<length; i++){
                if (Character.isUpperCase(myString.charAt(i))){
                    count++;
                }
            }
            if (count==1 || count == length){
                return true;
            }
        }
        if(Character.isLowerCase(myString.charAt(0))){
            {
                for (int i = 1; i<length; i++){
                    if (Character.isUpperCase(myString.charAt(i))){
                        count++;
                    }
                }

                if (count == 0 ){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}