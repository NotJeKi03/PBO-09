/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author notjeki03
 */
abstract class Hewan {
    abstract void suara();
}

// Kelas turunan dari Kendaraan
class Kucing extends Hewan {
    @Override
        void suara() {
            System.out.println("Kucing bersuara 'Meong'");
        }
}

class Anjing extends Hewan {
    @Override
        void suara() {
            System.out.println("Anjing bersuara 'Guk Guk'");
        }
}

