package quiz;

import java.util.Scanner;

public class Code5 {
    public static String solution(String s){
        String[] splitString = s.split("\n");

        int musicTotal = 0;
        int imageTotal = 0;
        int mobileTotal = 0;
        int otherTotal = 0;

        for(String data : splitString){
            String[] splitTemp = data.split(" ");
            if(splitTemp[0].contains(".mp3") || splitTemp[0].contains(".aac") || splitTemp[0].contains(".flac")){
                musicTotal+= Integer.valueOf(splitTemp[1].substring(0,splitTemp[1].length()-1));
            }else if(splitTemp[0].contains(".jpg") || splitTemp[0].contains(".bmp") || splitTemp[0].contains(".gif")){
                imageTotal+= Integer.valueOf(splitTemp[1].substring(0,splitTemp[1].length()-1));
            }else if(splitTemp[0].contains(".mp4") || splitTemp[0].contains(".avi") || splitTemp[0].contains(".mkv")){
                mobileTotal+= Integer.valueOf(splitTemp[1].substring(0,splitTemp[1].length()-1));
            }else{
                otherTotal+= Integer.valueOf(splitTemp[1].substring(0,splitTemp[1].length()-1));
            }
        }
        // 코드 작성
        return "music "+musicTotal+"b\n"+
                    "images "+imageTotal+"b\n"+
                    "movies "+mobileTotal+"b\n"+
                    "other "+otherTotal+"b\n";
    }

    public static void main(String[] args) {
        System.out.println(solution("mv.song.mp3 11b\n" +
                    "greatSong.flac 1000b\n" +
                    "not3.txt 5b\n" +
                    "video.mp4 200b\n" +
                    "game.exe 100b\n" +
                    "mov!e.mkv 10000b\n"));
    }
}
