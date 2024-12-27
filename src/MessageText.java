public class MessageText {
    public static StringBuilder duplicate(String text , char c){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            s.append(text.charAt(i));
            if (text.charAt(i) == c){
                s.append(c);
            }
        }
        return s;
    }
    public static StringBuilder construct(int[] arr){
        StringBuilder s = new StringBuilder();
        char[] c = {'a' , 'b' , 'c' , 'd' , 'e' };
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i]; j++){
                s.append(c[i]);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(construct(arr));
        System.out.println(duplicate("java" , 'a'));
    }
}
