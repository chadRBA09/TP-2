import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
class Jogador {
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    Jogador()
    {
       setId(0);
       setNome("");
       setAltura(0);
       setPeso(0);
       setNome("");
       setUniversidade("");
       setAnoNascimento(0);
       setCidadeNascimento("");
       setEstadoNascimento(""); 
    }

    Jogador(int id,String nome,int altura,int peso,String universidade,int anoNascimento,String cidadeNascimento,String estadoNascimento)
    {
        setId(id);
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
        setNome(nome);
        setUniversidade(universidade);
        setAnoNascimento(anoNascimento);
        setCidadeNascimento(cidadeNascimento);
        setEstadoNascimento(estadoNascimento);
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public void setNome (String nome)
    {
        if (nome.length() > 0)
        this.nome = nome;
        else
        nome = "nao informado";
    }

    public void setAltura (int altura)
    {
        this.altura = altura;
    }

    public void setPeso (int peso)
    {
        this.peso = peso;
    }

    public void setUniversidade (String universidade)
    {
        if (universidade.length() > 0)
        this.universidade = universidade;
        else
        nome = "nao informado";
    }

    public void setAnoNascimento (int anoNascimento)
    {
        this.anoNascimento = anoNascimento;
    }

    public void setCidadeNascimento (String cidadeNascimento)
    {
        if (cidadeNascimento.length() > 0)
        this.cidadeNascimento = cidadeNascimento;
        else
        nome = "nao informado";
    }

    public void setEstadoNascimento (String estadoNascimento)
    {
        if (nome.length() > 0)
        this.estadoNascimento = estadoNascimento;
        else
        nome = "nao informado";
    }

    public int getId ()
    {
        return this.id;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getAltura()
    {
        return this.altura;
    }

    public int getPeso()
    {
        return this.peso;
    }

    public String getUniversidade()
    {
        return this.universidade;
    }

    public int getAnoNascimento()
    {
        return this.anoNascimento;
    }

    public String getCidadeNascimento()
    {
        return this.cidadeNascimento;
    }

    public String getEstadoNascimento()
    {
        return this.estadoNascimento;
    }

    public Jogador clone()
    {
        Jogador clone = new Jogador();
        clone.nome = this.nome;
        clone.altura = this.altura;
        clone.peso = this.peso;
        clone.universidade = this.universidade;
        clone.anoNascimento = this.anoNascimento;
        clone.cidadeNascimento = this.cidadeNascimento;
        clone.estadoNascimento = this.estadoNascimento;
        return clone;
    }

    public void imprimir ()
    {
        System.out.println("["+getId() +" ## "+ getNome() +" ## " + getAltura() +" ## " + getPeso() +" ## " + getUniversidade() +" ## " + getAnoNascimento() +" ## " + getCidadeNascimento() +" ## " + getEstadoNascimento() + "]"); 
    }

    public void ler (String linha)
    {
        int index[] = new int[7];
        //System.out.println(linha);
        int virgulas = 0;
        for (int i = 0 ; i < linha.length(); i++)
        {
            if (linha.charAt(i) == ',')
            {
                //System.out.println(virgulas);
                index[virgulas] = i;
                virgulas++;
            }
        }
        setId(Integer.parseInt(linha.substring(0,index[0])));
        setNome(linha.substring(index[0]+1,index[1]));
        setAltura(Integer.parseInt(linha.substring(index[1]+1,index[2])));
        setPeso(Integer.parseInt(linha.substring(index[2]+1,index[3])));
        if ((index[4] - index[3]+1) != 2)
        setUniversidade(linha.substring(index[3]+1,index[4]));
        else
        setUniversidade("nao informado");
        setAnoNascimento(Integer.parseInt(linha.substring(index[4]+1,index[5])));
        if ((index[6] - index[5]+1) != 2) 
        setCidadeNascimento(linha.substring(index[5]+1,index[6]));
        else
        setCidadeNascimento("nao informado");
        if ((linha.length() - index[6]+1) != 2) 
        setEstadoNascimento((linha.substring(index[6]+1,linha.length())));
        else
        setEstadoNascimento("nao informado");
    }
    
}

public class TP02Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador[] jogador = new Jogador[3922];
        int cont = 0;
        
        try{
            BufferedReader arq = new BufferedReader(new FileReader("Players.csv")); //Leitura do arquivo
            arq.readLine(); //lendo a primeira linha para pular para a segunda
            while(arq.ready()) //enquanto nao estiver no fim do arquivo 
            {
                jogador[cont] = new Jogador();
                jogador[cont].ler(arq.readLine());
                cont++;
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        String id = sc.nextLine();
        while(!id.equals("FIM"))
        {
            for (int i = 0; i < jogador.length; i++)
            {
                if(jogador[i].getId() == Integer.parseInt(id))
                {
                    jogador[i].imprimir();
                    break;
                }
            }
            id = sc.nextLine();
        }
    }
}
