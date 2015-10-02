package innerclasses.exercise14;
interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}


class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

interface Lethal {
	void kill();
}
interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destroy() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

public class HorrorShow {
	public Vampire getVampire() {
		return new Vampire() {
			@Override
			public void drinkBlood() {

			}

			@Override
			public void destroy() {

			}

			@Override
			public void kill() {

			}

			@Override
			public void menace() {

			}
		};
	}
	
	public DangerousMonster getMonster(){
		return new DangerousMonster(){
			@Override
			public void menace(){
				
			}
			@Override
			public void destroy(){
				
			}
		};
	}
	
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
} /// :~
