class Contact<T1,U1> {
    //Fill your code
    private T1  _att1;
    private U1  _att2;


    Contact(T1 _att1, U1 _att2){
        this._att1=_att1;
        this._att2=_att2;
    }


    public T1 get_att1(){
        return _att1;
    }
    public U1 get_att2(){
        return _att2;
    }


    public void print(){
        System.out.println(_att1);
    }
}
