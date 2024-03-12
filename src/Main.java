import java.lang.annotation.Annotation;

@Tabela("Tabela Do Hello World")
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main tabela = new Main();
        Annotation[] annotations = tabela.getClass().getAnnotations();

        for (Annotation an : annotations) {
            System.out.println("Anotação: " + an.annotationType());
            System.out.println("Valor da Anotação: " + tabela.getClass().getAnnotation(Tabela.class));
        }
    }



}
