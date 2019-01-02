package presenter;

import model.IModel;
import model.ModelImpl;
import view.IView;

public class PresenterImpl implements IPresenter{
    private ModelImpl model;
    IView iView;

    public PresenterImpl(IView iView) {
        model=new ModelImpl();
        this.iView=iView;
    }

    @Override
    public void getModleData(String url) {
        model.getdata(url, new IModel.Sta() {
            @Override
            public void sucess(Object o) {
                iView.sucess(o);
            }

            @Override
            public void fail(Exception e) {
                iView.failed(e);
            }
        });
    }
}
