package estudos.alura.audos.modelos;

public class Preferidas {


    public void inclui(Audio audio){
        if (audio.getClassificacao() > 8 ){
            System.out.println("Sucesso Absoluto");

        } else {
            System.out.println("Nhe");
        }
    }
}
