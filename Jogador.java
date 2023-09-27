public class Jogador {
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
        this.nome = nome;
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
        this.universidade = universidade;
    }

    public void setAnoNascimento (int anoNascimento)
    {
        this.anoNascimento = anoNascimento;
    }

    public void setCidadeNascimento (String cidadeNascimento)
    {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento (String estadoNascimento)
    {
        this.estadoNascimento = estadoNascimento;
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
        
        System.out.println(getNome() + getAltura() + getPeso() + getUniversidade() + getAnoNascimento() + getCidadeNascimento() + getEstadoNascimento()); 
        
        
    }
    public static void main(String[] args) {
        
    }
}
