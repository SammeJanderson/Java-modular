package Calculadora.utils;

import Calculadora.utils.operacoes.DivHelper;
import Calculadora.utils.operacoes.MultiHelper;
import Calculadora.utils.operacoes.SubHelper;
import Calculadora.utils.operacoes.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;
    private DivHelper divHelper;

    public Calculadora(){
    sumHelper = new SumHelper();
    subHelper = new SubHelper();
    divHelper = new DivHelper();
    multiHelper = new MultiHelper();
    }

    public int sum(int a, int b){return sumHelper.execute(a,b);}

    public int sub(int a, int b){return subHelper.execute(a,b);}

    public int multi(int a, int b){return multiHelper.execute(a,b);}

    public int div(int a, int b){return divHelper.execute(a,b);}

}
