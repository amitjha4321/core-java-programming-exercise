package collectionpractice;

public class SubstringLen {
   // 8 byte -- 64 -->2^64

    public static int retLength( String s) {
        //char[] a = s.toCharArray();//local
      //  int count = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int count=0;
            int j;
            for ( j = i + 1; j < s.length(); j++) {
                /*
                if (s.codePointAt(j - 1) + 1 == s.codePointAt(j)) {
                    count++;
                } else {
                    break;
                }
                */
                int a = s.charAt(j-1)-'a';
                int b = s.charAt(j)-'a';


                if ((a + 1) % 26 == b){
                    count++;
                } else {
                    break;
                }

            }

            if (count > max) {
                max = count;
            }
        }

        return max+1;
    }


    public static void main(String[] args) {
        String str = "stuzabcdemno";
        SubstringLen len = new SubstringLen();
        int l =len.retLength(str);

        System.out.println(l);
    }
}
