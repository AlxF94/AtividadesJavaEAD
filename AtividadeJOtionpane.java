package AtividadeJOtionPane;
import javax.swing.JOptionPane;
public class Lista {
    public static void main(String[] args) {
        String usuario;
        int idade = 0;
        usuario = JOptionPane.showInputDialog(null,"Qual seu nome?","Questionario",JOptionPane.QUESTION_MESSAGE);
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual sua Idade?","Questionario",JOptionPane.QUESTION_MESSAGE));
        if (idade>=18) {
            JOptionPane.showMessageDialog(null,usuario + " já pode tirar a chn e encher o cu de pinga");
        }else{
                JOptionPane.showMessageDialog(null,usuario + " ,você ainda não pode tirar a CNH, você tem apenas "+ idade+ "anos.");
        }
    }
    
}