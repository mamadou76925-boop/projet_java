public class Tarif{
public static void main(){ 
int nbcopie ;
nbcopie=0;
double prix;
if (nbcopie<=10){
prix =10*0.10;

}else if (nbcopie>10 && nbcopie<=30){
prix=10*0.10+(nbcopie-10)*0.08};
else {prix=10*0.10+20*0.08+(nbcopie-30)*0.07}
system.out.println("le prixtotal des "+nbcopie+"copie="+prix);
}
}
