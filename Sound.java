import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

public class Sound {
    public static void main(String[] args) {
        PlayTone play = new PlayTone();


        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3        
        play.play(0.3f,-2, 0.45f);     //5                      
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3        
        play.play(0.3f,-2, 0.45f);     //5                      
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        
        play.play(0.3f,-10, 1);        //7
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        
        play.play(0.3f,-10, 1);        //7
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 8, 0.5f);      //4
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3        
        play.play(0.3f,-2, 0.45f);     //5                      
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3        
        play.play(0.3f,-2, 0.45f);     //5                      
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f, 7, 0.5f);      //3
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f, 12, 0.6f);     //6
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f, 12, 0.6f);     //6

        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f, 12, 0.6f);     //6
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 7, 0.5f);      //3
        play.play(0.3f, 12, 0.6f);     //6
        
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-4, 0.6f);      //#4
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f,-4, 0.6f);      //#4
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2

        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-4, 0.6f);      //#4
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f,-4, 0.6f);      //#4
        play.play(0.3f,-0, 0.5f);      //6
        play.play(0.3f, 5, 0.5f);      //2
        
        play.play(0.3f,-10, 1);        //7
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 10, 0.5f);     //5
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 10, 0.5f);     //5
        
        play.play(0.3f,-10, 1);        //7
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 10, 0.5f);     //5
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 10, 0.5f);     //5
        
        play.play(0.3f,-10, 1);        //7
        play.play(0.3f,-9, 1);         //1
        play.play(0.3f,-5, 0.8f);      //3
        play.play(0.3f,-2, 0.45f);     //5                      
        play.play(0.3f, 3, 0.5f);      //1
        play.play(0.3f,-5, 0.8f);      //3
        play.play(0.3f,-2, 0.45f);     //5                      
        play.play(0.3f, 3, 0.5f);      //1
        
        play.play(0.3f,-10, 1);        //7
        play.play(0.3f,-7, 1);         //2
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 10, 0.5f);     //5
        play.play(0.3f,-2, 0.45f);     //5
        play.play(0.3f, 5, 0.5f);      //2
        play.play(0.3f, 10, 0.5f);     //5
        
        
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        
        
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	11	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	11	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	11	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	11	,	0.5f	);
        
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	0	,	0.5f	);
        play.play(0.3f,	5	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	0	,	0.5f	);
        play.play(0.3f,	5	,	0.5f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	0	,	0.5f	);
        play.play(0.3f,	5	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	0	,	0.5f	);
        play.play(0.3f,	5	,	0.5f	);
        
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-13	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-13	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	3	,	0.5f	);
        
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        
        play.play(0.3f,	-28	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-28	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        
        play.play(0.3f,	-27	,	1f	);
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-6	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-6	,	0.5f	);
        play.play(0.3f,	-27	,	1f	);
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-6	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-6	,	0.5f	);
        
        play.play(0.3f,	-13	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-13	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-7	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-18	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-18	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-3	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-26	,	1f	);
        play.play(0.3f,	-10	,	1f	);
        play.play(0.3f,	-4	,	0.5f	);
        
        play.play(0.3f,	-33	,	1f	);
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-33	,	1f	);
        play.play(0.3f,	-21	,	0.45f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-11	,	1f	);
        play.play(0.3f,	-5	,	0.5f	);
        
        play.play(0.3f,	-33	,	1f	);
        play.play(0.3f,	-17	,	0.6f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-9	,	0.5f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-12	,	1f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-19	,	0.45f	);
        play.play(0.3f,	-16	,	0.6f	);
        play.play(0.3f,	-19	,	0.45f	);
        
        play.play(0.3f,	-33	,	1f	);
        play.play(0.3f,	-14	,	0.8f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	5	,	0.5f	);
        play.play(0.3f,	8	,	0.5f	);
        play.play(0.3f,	5	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	2	,	0.5f	);
        play.play(0.3f,	-2	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        play.play(0.3f,	-4	,	0.5f	);
        play.play(0.3f,	-5	,	0.5f	);
        play.play(0.3f,	-7	,	0.5f	);
        
        play.play(1f,	3	,	0.5f	);


    }
}

class PlayTone {
    public static final float sampleRate = 8000;
    public static final int sampleSizeIntBits = 8;
    public static final int channels = 1;
    public static final boolean singed = true;
    public static final boolean bigEndian = true;
    
    AudioFormat audioFormat;
    SourceDataLine sourceDataLine;
    
    
    
    public void playKey(int tone) {
        switch(tone) {
            case -7:
                    play(0.3f,-10, 1);        //7
                    break;
            case 1:
                    play(0.3f,-9, 1);         //1
                    break;
            
            case 2:
                    play(0.3f,-7, 1);         //2
                    break;
                    
            case 3:
                    play(0.3f,-5, 0.8f);      //3
                    break;
                    
            case 4:
                    play(0.3f,-4, 0.6f);      //4
                    break;
                    
            case 5:
                    play(0.3f,-2, 0.45f);     //5
                    break;
                 
            case 6:
                    play(0.3f,-0, 0.5f);      //6
                    break;
                    
            case 7:
                    play(0.3f, 2, 0.5f);      //7
                    break;
                    
            case 11:
                    play(0.3f, 3, 0.5f);      //1
                    break;
                    
            case 12:
                    play(0.3f, 5, 0.5f);      //2
                    break;
                    
            case 13:
                    play(0.3f, 7, 0.5f);      //3
                    break;
                    
            case 14:
                    play(0.3f, 8, 0.5f);      //4
                    break;
                    
            case 15:
                    play(0.3f, 10, 0.5f);     //5
                    break;
                    
            case 16:
                    play(0.3f, 12, 0.6f);     //6
                    break;
                    
            case 17:
                    play(0.3f, 14, 0.65f);     //7
        
        }
    }
    
    public PlayTone() {
        try {
            audioFormat = new AudioFormat(sampleRate, sampleSizeIntBits, channels, singed, bigEndian);
            sourceDataLine = AudioSystem.getSourceDataLine(audioFormat);
                
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();
        } catch(Exception e) {
            System.out.println("Cannot play the sound because of the uncatched exceptions !");        
        }
    }
    
    
    // length is the duration of the tone, key is the key on the keyboard that related to a in a piano 
    public void play(float length, int key, float amplitude) {
        float keyf = (float)key;
        int sample = (int) (length * sampleRate);
        byte wave[] = new byte[sample];
        float frequency = 440 * ((float)(Math.pow(2, (keyf / 12))));
        System.out.println(frequency);
        for(int i = 0; i < sample; i++) {
            wave[i] = (byte) (amplitude * 127 * Math.sin(
            (2.0 * Math.PI * i) / sampleRate * frequency
            ));
        }
        
        try {
            sourceDataLine.write(wave, 0, sample);
        } catch(Exception e) {
            System.out.println("Cannot play the sound because of the uncatched exceptions !");
        }
        
    }


    public void end() {
        try {          
            sourceDataLine.drain();
            sourceDataLine.close();
        } catch(Exception e) {
            System.out.println("cannot close the output system because of the uncatched exceptions !");
        }
    }
}
