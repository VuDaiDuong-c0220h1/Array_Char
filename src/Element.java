public class Element {
    public static void main(String[] args) {
        String text = "chuoi ky tu nay co bao nhieu chu c";
        Character c = 'c';
        int count = 0;
        for ( int i = 0; i < text.length(); i++){
            if (c.equals(text.charAt(i))){
                count++;
            }
        }
        System.out.println("Có tất cả " + count + " ký tự c");
    }
}
