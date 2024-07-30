public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        if (!ligada) {
            ligada = true;
        } else {
            System.out.println("A TV já está ligada e será desligada.");
            desligar();
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
        } else {
            System.out.println("A TV já está desligada e será ligada.");
            ligar();
        }
    }

    public void aumentarVolume() {
        if (ligada) {
            if (volume < 100 && ligada) {
                volume++;
            } else {
                System.out.println("Não é possivel aumentar pois o volume 100 já é o máximo");
            }
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            if (volume > 0 && ligada) {
                volume--;
            } else {
                System.out.println("Não é possível diminuir pois o volume já é 0");
            }
        }
    }

    public void proximoCanal() {
        if (ligada) {
            if (canal < 100) {
                canal++;
            } else {
                System.out.println("Não é possivel acessar canais acima do 100");
            }
        }
    }

    public void canalAnterior() {
        if (ligada) {
            if (canal > 1) {
                canal--;
            } else {
                System.out.println("Não é possivel acessar canais abaixo de 0");
            }
        }
    }

    public void selecionarCanal(int novoCanal) {
        if (ligada) {
            if (novoCanal != canal) {
                canal = novoCanal;
            } else {
                System.out.println("Esse já é o canal atual: " + novoCanal);
            }
        }
    }
}
