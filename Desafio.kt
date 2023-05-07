// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val dificuldade: Enum<Nivel>) {

    val inscritos = mutableListOf<Usuario>()
    
    //Listar todos os alunos inscritos na fomração
    fun listarInscritos(nome: String){
        for(Usuario in inscritos){
            println("${Usuario.nome} é inscrito da formação ${nome}")
        }
    }
    
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("${usuario.nome} foi inscrito com sucesso.")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    //Formação Android
    val listaDeConteudo = mutableListOf(ConteudoEducacional("Conteudo A"), ConteudoEducacional("Conteudo B"))
    val formacaoAndroid = Formacao ("Android", listaDeConteudo, Nivel.INTERMEDIARIO)
    println("Formação: ${formacaoAndroid}")
    val alunoAndroid = Usuario("Regis")
    
    formacaoAndroid.matricular(alunoAndroid)   //Matricular alunoAndroid
    
    val novoAlunoAndroid = Usuario("Paulo")
    formacaoAndroid.matricular(novoAlunoAndroid)     //Matricular novoAlunoAndroid
    
    println("__________________________")
    println("Formação: ${formacaoAndroid.nome} \nDificuldade: ${formacaoAndroid.dificuldade} ") //Print formação (Nome e conteudos)
    formacaoAndroid.listarInscritos(formacaoAndroid.nome) //Lista todos os inscritos
    println()
    println()
    //Fim formação Android
    
    //Formação PHP    
    val listaDeConteudo2 = mutableListOf(ConteudoEducacional("Conteudo A"), ConteudoEducacional("Conteudo B"))
    val formacaoPHP = Formacao ("PHP", listaDeConteudo2, Nivel.BASICO)
    println("Formação: ${formacaoPHP}")
    val alunoPHP = Usuario("Joao")
    
    formacaoPHP.matricular(alunoPHP)  
    
    val novoAlunoPHP = Usuario("Luiz")
    formacaoPHP.matricular(novoAlunoPHP)
    
    println("__________________________")
    println("Formação: ${formacaoPHP.nome} \nDificuldade: ${formacaoPHP.dificuldade} ") //Print formação (Nome e conteudos)
    formacaoPHP.listarInscritos(formacaoPHP.nome) //Lista todos os inscritos
    //Fim Formação PHP
    
}
