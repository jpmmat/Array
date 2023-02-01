public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        
        int count = 0;
        System.out.print("Vetor: ");
        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        int i = vetor.length-1;
        System.out.print("\nVetor inverso: ");
        while(i>=0){
            System.out.print(vetor[i] +" ");
            i--;
        }
    }
}
