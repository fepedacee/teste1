/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

/**
 *
 * @author Cielo
 */
public class Cliente {
 private String nome;
 private int RG;
 private int CPF;
 private int celular;
 private String medicoPreferencia;
 private String descricaoDoenca;
 private String tratamentos;
    
    
    

public Cliente(String nome,int RG,int CPF, int celular,String medicoPreferencia,String descricaoDoenca,String tratamentos){
this.nome=nome;
this.RG=RG;
this.CPF=CPF;
this.celular=celular;
this.medicoPreferencia=medicoPreferencia;
this.descricaoDoenca=descricaoDoenca;
this.tratamentos=tratamentos;

    

}
public String getnome(){
        return nome;

}
public void setnome(String nome){
    this.nome=nome;
}

public int getRG(){
        return RG;
}
public void setRG(){
       this.RG=RG;
}
public int getcelular(){
        return celular;
}
public void setcelular(){
       this.celular=celular;
}
public String medicoPreferencia(){
        return medicoPreferencia;
}
public void setmedicoPreferencia(){
       this.medicoPreferencia=medicoPreferencia;
}
public String descricaoDoenca(){
        return descricaoDoenca;
}
public void setdescricaoDoenca(){
       this.medicoPreferencia=medicoPreferencia;
}
public String tratamentos(){
        return tratamentos;
}
public void settratamentos(){
       this.tratamentos=tratamentos;

}





}







