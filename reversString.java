public class reversString {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // // set the new value
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);

        // // insert the new value
        // sb.insert(1, 't');
        // System.out.println(sb);

        // // delete the value
        // sb.delete(0, 1);
        // System.out.println(sb);

        // // append the value
        // sb.append('h');
        // System.out.println(sb);

        StringBuilder str = new StringBuilder("Hello");

        // Reverse the string
        for(int i=0;i<str.length()/2;i++){
            int front = i;
            int backend = str.length()-1-i;

            char first = str.charAt(front);
            char last = str.charAt(backend);

            str.setCharAt(front, last);
            str.setCharAt(backend, first);
        }

        System.out.println(str);
    }
}
