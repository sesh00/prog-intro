public class Sum {
    public static void main(String[] args){
        int sum = 0;

        for (String arg : args) {
            int i = 0;
            while (i < arg.length()) {
                int j;
                for (j = i; j < arg.length(); j++) {
                    if (!Character.isDigit(arg.charAt(j)) && arg.charAt(j) != '-') {break;}
                }

                if (j > i) sum += Integer.parseInt(arg.substring(i, j));
                i = j + 1;
            }
        }
        System.out.println(sum);
    }
}
