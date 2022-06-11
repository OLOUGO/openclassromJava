public class MyLoops {
    
    public static void main(String[] args) {
        int i=0;


        // Créez une boucle qui affiche la phrase "Je m'amuse tellement !" 5 fois.

        
      /*  for(int i=0 ; i<5;i++)
        {
            System.out.println("Je m'amuse tellement !");
        }
        */


        // Changez votre boucle "for" par une boucle "while". Etait-ce une bonne idée ? et Sautez l'affichage de la quatrième boucle 

        while(i<5)
        {
            if(i==0 || i==1 || i==2 || i==3)
            {
             System.out.println("Je m'amuse tellement !");
            }
             i++;
        }
        
    }
}
