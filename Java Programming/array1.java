   import java.util.Arrays;
   class array1{
    public static void main(String[] args){
        String[] playlist = new String[3];
        playlist[0] = "song 1";
        playlist[1] = "song 2";
        playlist[2] = "song 3";
        System.out.println(playlist[0]);
        System.out.println(playlist[2]);
        String[] playlist_2 = {"song 4","song 5","song 6"};
        System.out.println(playlist_2[2]);
        System.out.println(Arrays.toString(playlist));
        System.out.println(Arrays.toString(playlist_2));

    }
   }