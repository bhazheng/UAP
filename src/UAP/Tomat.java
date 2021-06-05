package UAP;

class Tomat extends Tanaman {
    public Tomat() {
        super(100,100,0.25);
    }

    @Override
    public void berkembang() {
        super.berkembang();
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 0.05);
    }
}
