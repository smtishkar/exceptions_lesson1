public class Task2 {

/*
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */
    public static void main(String[] args) {
        
    // String [][] arr = new String[][] {{"1","2","2"},{"1","2","2"},{"1","2","2"}};         // Корректный массив      
    // String [][] arr = new String[][] {{"1","2dsgfds","2"},{"0","2"},{"1","2","2"}};     // NumberFormatException
    String [][] arr = new String[][] {{"1","2","2"},{"0","2"},{"1","2","2"}};        // ArrayIndexOutOfBoundsException
    sum2d(arr);
    }

    public static int sum2d(String[][] arr){ 
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < 3; j++) { 
                int val = Integer.parseInt(arr[i][j]); 
                sum += val; 
            } 
        } return sum; 
    }
}

// Ответ может получиться 2а типа исключения:
//1. ArrayIndexOutOfBoundsException
//2. NumberFormatException
