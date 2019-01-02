package model;

public interface IModel {
    public void getdata(String url,Sta sta);
    public interface Sta{
        public void sucess(Object o);
        public void fail(Exception e);
    }
}
