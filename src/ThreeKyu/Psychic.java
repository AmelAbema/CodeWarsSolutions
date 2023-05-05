package ThreeKyu;

import java.lang.reflect.Field;

import java.util.Random;

import java.util.concurrent.atomic.AtomicLong;

public class Psychic {
    public static void main(String[] args) {
        for(int i = 0; i < 5; ++i) {
            double guess = Psychic.guess();
            double choice = Math.random();
            System.out.format("%1.20f =? %1.20f => %b%n",guess,choice,guess == choice);
        }
    }

    public static double guess() {
        try {
            return (new Psychic()).predict();
        }
        catch(Exception e) {
            System.err.println(e + "error");
        }
        return -11.11;
    }

    protected Random rand;
    protected AtomicLong seed;

    public Psychic() throws Exception {
        rand = getMathRand();
        seed = (AtomicLong)getObjVar(rand,"seed");
    }

    public double predict() throws Exception {
        Random rand = new Random();

        setObjVar(rand,"seed",new AtomicLong(seed.get()));

        return rand.nextDouble();
    }

    public static void setObjVar(Object obj,String id,Object value) throws Exception {
        Field field = obj.getClass().getDeclaredField(id);

        field.setAccessible(true);
        field.set(obj,value);
    }

    public static Random getMathRand() throws Exception {
        Class<?> holder = Class.forName("java.lang.Math$RandomNumberGeneratorHolder");
        Field field = holder.getDeclaredField("randomNumberGenerator");

        field.setAccessible(true);

        return (Random)field.get(holder);
    }

    public static Object getObjVar(Object obj,String id) throws Exception {
        Field field = obj.getClass().getDeclaredField(id);

        field.setAccessible(true);

        return field.get(obj);
    }
}