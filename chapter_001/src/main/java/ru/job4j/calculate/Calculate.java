package ru.job4j.calculate;

/**
 *Class Класс для вывода строки "aah"
 *@author solovev
 *@since 16.01.2019
 *@version 1.0
 */
public class Calculate {
    public String echo(String value){
	return String.format("%s %s %s",value,value,value);
    }
    /**
    *Конструктор, вывод строки в консоль
    *@param arg - arg.
    */
    public static void main(String[] args){
        Calculate calc = new Calculate();
        System.out.println(calc.echo("aah"));
    }
}