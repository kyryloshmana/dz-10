import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();
        /******************/
        System.out.println("accountId000");
        try {
           bankApplication.process("accountId000", 50, "USD");
        }catch (WrongAccountException wrongAccountException){
            System.out.println("Такого акаунта не існує");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }catch (WrongOperationException wrongOperationException){
            System.out.println("Акаунт не має достатньо коштів");
        }catch (Exception exception){
            System.out.println("Сталась помилка при процесінгу, спробуйте це раз");
        }finally {
            System.out.println("Дякуємо що скористались нашим сервісом");
        }
        /******************/
        System.out.println("accountId003");
        try {
            bankApplication.process("accountId003", 250, "HRV");
             }catch (WrongAccountException wrongAccountException){
            System.out.println("Такого акаунта не існує");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }catch (WrongOperationException wrongOperationException){
            System.out.println("Акаунт не має достатньо коштів");
        }catch (Exception exception){
            System.out.println("Сталась помилка при процесінгу, спробуйте це раз");
        }finally {
            System.out.println("Дякуємо що скористались нашим сервісом");
        }        /******************/
        System.out.println("accountId001");
        try {
              bankApplication.process("accountId001", 50, "EUR");
        }catch (WrongAccountException wrongAccountException){
            System.out.println("Такого акаунта не існує");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }catch (WrongOperationException wrongOperationException){
            System.out.println("Акаунт не має достатньо коштів");
        }catch (Exception exception){
            System.out.println("Сталась помилка при процесінгу, спробуйте це раз");
        }finally {
            System.out.println("Дякуємо що скористались нашим сервісом");
        }        /******************/
        try {
            System.out.println("accountId001");
            bankApplication.process("accountId001", 50, "USD");
        }catch (WrongAccountException wrongAccountException){
            System.out.println("Такого акаунта не існує");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }catch (WrongOperationException wrongOperationException){
            System.out.println("Акаунт не має достатньо коштів");
        }catch (Exception exception){
            System.out.println("Сталась помилка при процесінгу, спробуйте це раз");
        }finally {
            System.out.println("Дякуємо що скористались нашим сервісом");
        }        /******************/
        System.out.println("accountId001");
        try {
            bankApplication.process("accountId001", 50, "USD");
        }catch (WrongAccountException wrongAccountException){
            System.out.println("Такого акаунта не існує");
        }catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Акаунт має рахунок в іншій валюті");
        }catch (WrongOperationException wrongOperationException){
            System.out.println("Акаунт не має достатньо коштів");
        }catch (Exception exception){
            System.out.println("Сталась помилка при процесінгу, спробуйте це раз");
        }finally {
            System.out.println("Дякуємо що скористались нашим сервісом");
        }






        }
}
