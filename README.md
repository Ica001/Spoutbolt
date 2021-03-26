# Spoutbolt

## Subscriptiile
Mod de funtionare exemplu:
 Pentru 100 de subscriptii :
 1. se steaza frecventa campurilor (setFieldFrequency("city",0.4) ,setFieldFrequencyWithOperator("wind",0.8,">",0.5))
 2. algoritmul alege la intamplare din cele 100 de subscriptii "goale" 40 (Math.round(0.4 * 100)) in care pune campul city si 80 (...) in care pune campul "wind" 
     si genereaza valori in functie de campul respectiv. Exista posibilitatea sa se puna in aceiasi subscriptie si campul "wind" si campul "city".
 3. Se aleg la intamplare (0.5)* 80 subscrptii care contin campul "wind" si se pune ca operator ">".
    In felul acesta putem seta ponderea pentru ce camp dorim inclusiv campul cu domeniul cel mai mic.
 5. Dupa acesti pasi se completeaza subscriptiile generate cu valori random dar fara sa se puna campul "city" si "wind" deoarece acestea au fost deja puse si
    au un numar prestabilit nu se permite adugarea. Completarea se face la intmaplare si in sensul ca pentru fiecare subsciptie algorimul completeaza cu inca x 
    campuri care sunt disponibile (nu sunt deja in subsciptie si nu sunt "city" sau "wind"). x=un numar random cuprins intre cate locuri sunt ocupate in subscriptie
    si numarul maxim de locuri din subscriptie.
    
  Obs:
   Intrucat completarea este aleatoare se poate ca algoritmul sa nu adauge nici un camp la o anumita subscriptie si atunci este posibil "cu sanse mici" sa apara subscriptii
   fara nici un camp inteleganduse prin acestea ca un client este intersat de toate publicatiile practic nu pune nici un "filtru"(subscriptie) 
   
   Deoarece nu stim daca este permis sa existe subscriptii nule noi am mai facut o versiune care nu permite sa existe acest lucru. (commitul "fara subscriptii nule").
    
   ## Publicatiile:
   Pentru fiecare camp se alege o valore la intamplare din domeniu. 
   Exemplu: 
1. Pentru rain domeniul e [0,1]  se genereaza un numar random intre 0 si 100 poate 57 si apoi se imparte la 100 rezultatul este 0.57 si asta e valoarea pentru rain.
            2. Pentru city se alege la intamplare un numar cuprins intre 0 si list.size()  din lista list={"Iasi","Galti","Timisoara", ...} si valoare este list[numarul_random].
            3. Pentru date se alege un an se alege o luna se verifica daca este an bisect se alge o zi in functie de luna si de variabila booleana yearIsBisect.
            ...etc
    
