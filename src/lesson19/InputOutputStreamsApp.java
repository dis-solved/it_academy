package lesson19;

//        InputStream OutputStream (byte by byte) Bufferred (In chunks)


import java.io.*;

public class InputOutputStreamsApp {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\KingaBlaszczynska\\Documents\\ITacademy\\src\\test.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
            writeData();
        }
    }

    private static void writeData() throws IOException{
        try (OutputStream os = new FileOutputStream("test333.txt")) {
            os.write(65);
            os.write(78);
            os.write(99);
            os.flush();
            os.close(); // this can be omitted when using try catch
        }

//        OutputStream os = null;
//        try{
//            os = new FileOutputStream("test444.txt");
//            os.write(66);
//            os.write(77);
//        } catch (IOException e) {
//            if (os != null){
//                try {
//                    os.close();
//                } catch (IOException e1);
//            }
//        }
//              }
////    private void readWithReader() throws IOException {
////        Reader r = new FileReader("C:\\Users\\KingaBlaszczynska\\Documents\\ITacademy\\src\\test.txt");
////
////        char[] chars = new char[100];
////        while (r.read() != -1){
////            System.out.println(chars);
////        }
////
////        int c;
////        while ((c = r.read()) != -1) { //method read from reader reads by character
////            System.out.println(c);
////
////        }
    }
    }
