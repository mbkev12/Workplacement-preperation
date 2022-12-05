 public static void main(String[] args) {

        int [] Tax; // A 1-D Array
        int [][] TaxPrecentage; // A 2-D Array
        TaxPrecentage = new int [2][3];
        TaxPrecentage[0][0] = 30;
        TaxPrecentage[0][1] = 50;
        TaxPrecentage[0][2] = 60;
        TaxPrecentage[1][0] = 20;
        TaxPrecentage[1][1] = 15;
        TaxPrecentage[1][2] = 40;

        // Displaying the 2-D Array (for loop)
        System.out.println("Multidiminsional Tax Array");
        for(int i=0;i<TaxPrecentage.length;i++){
            for(int j=0;j<TaxPrecentage[i].length;j++) {
                System.out.print(TaxPrecentage[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
