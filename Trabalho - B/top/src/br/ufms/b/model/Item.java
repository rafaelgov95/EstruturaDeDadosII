package br.ufms.b.model;


public interface Item {
  public int compara (Item it);
  public void alteraChave (Object chave);
  public Object recuperaChave ();
}
