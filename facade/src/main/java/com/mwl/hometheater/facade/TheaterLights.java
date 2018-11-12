package com.mwl.hometheater.facade;

/**
 * @author mawenlong
 * @date 2018/11/11
 */
public class TheaterLights {

  private String description;

  public TheaterLights(String description) {
    this.description = description;
  }

  public void on() {
    System.out.println(description + " on");
  }

  public void off() {
    System.out.println(description + " off");
  }

  public void dim(int level) {
    System.out.println(description + " dimming to " + level + "%");
  }

  @Override
  public String toString() {
    return description;
  }
}
