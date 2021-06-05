package UAP;

class Stroberi extends Tanaman {
    public Stroberi() {
        super(60,150,0.35);
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
