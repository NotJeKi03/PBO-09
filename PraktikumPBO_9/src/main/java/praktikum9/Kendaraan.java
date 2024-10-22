/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author notjeki03
 */
// Definisi kelas abstrak
abstract class Kendaraan {
  // Metode abstrak
  abstract void berjalan();
  // Metode dengan implementasi
  void info() {
    System.out.println("Ini adalah kendaraan.");
  }
}

// Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {
  @Override
  void berjalan() {
    System.out.println("Mobil sedang berjalan dengan cepat.");
  }
}
class Sepeda extends Kendaraan {
  @Override
  void berjalan() {
    System.out.println("Sepeda sedang berjalan dengan pelan.");
   }
}
