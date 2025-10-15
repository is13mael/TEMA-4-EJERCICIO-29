public class App {
    public static void main(String[] args) {try{
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida = System.console().readLine().toLowerCase();

        System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = System.console().readLine().toLowerCase();

        Double precioPalmera = 0.0;
        Double precioDonut = 0.0;
        Double precioPitufo = 0.0;
        Double precioZumo = 0.0;
        Double precioCafe = 0.0;
        String detalleComida = "";
        String detalleBebida = "";

        if(comida.equals("palmera")){
            precioPalmera = 1.4;
            detalleComida = "Palmera";
        } else if(comida.equals("donut")){
            precioDonut = 1.0;
            detalleComida = "Donut";
        }else if(comida.equals("pitufo")){
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            String pitufo = System.console().readLine().toLowerCase();
            if(pitufo.equals("aceite")){
                precioPitufo = 1.2;
                detalleComida = "Pitufo con aceite";
            }else if(pitufo.equals("tortilla")){
                precioPitufo = 1.6;
                detalleComida = "Pitufo con tortilla";
            }else{
                System.out.println("No has elegido ninguno de los 2.");
                return;
            }
        }else{
            System.out.println("No has dicho ninguno de los 3.");
            return;
        }

        if(bebida.equals("zumo")){
            precioZumo = 1.5;
            detalleBebida = "Zumo";
        } else if(bebida.equals("café")){
            precioCafe = 1.2;
            detalleBebida = "Café";
        } else{
            System.out.println("No se ha elegido ninguna de las 2.");
            return;
        }

        double total = precioCafe + precioDonut + precioPalmera + precioPitufo + precioZumo;
        System.out.printf("%-20s %10.2f %n", detalleComida + ":", precioDonut + precioPalmera + precioPitufo );
        System.out.printf("%-20s %10.2f %n", detalleBebida + ":", precioCafe + precioZumo);
        System.out.printf("%-20s %10.2f %n","Total: ", total);
    }catch(NumberFormatException e){
        System.out.println("Numero mal elegido." );
    }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
}
}
