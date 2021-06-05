package UAP;

class Persik extends Tanaman {
    public Persik() {
        super(180,250,0.15);
    }

    @Override
    public void berkembang() {
        super.berkembang();
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 0.025);
    }
}
