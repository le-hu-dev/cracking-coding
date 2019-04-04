public class UserInput {

    public static class TextInput {
        String current = "";

        public void add(char c) {
            current += String.valueOf(c);
        }

        public String getValue() {
            return current;
        }
    }


    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
           // super.add(c);
//            int a = Character.getNumericValue(c);
            if (c>='0' && c<='9') {
                current += String.valueOf(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());

//        char c='0';
////        int a=Character.getNumericValue(c);
//        System.out.println(c);

    }
}