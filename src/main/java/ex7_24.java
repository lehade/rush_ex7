public class ex7_24 {
    public static void main(String[] args) {
        Human gmother1 = new Human("aaa",false, 77);
        Human gmother2 = new Human("bbb",false, 78);
        Human gfather1 = new Human("ccc",true, 79);
        Human gfather2 = new Human("ddd",true, 80);

        Human father = new Human("eee",true, 40, gfather1, gmother1);
        Human mother = new Human("fff",false, 37, gfather2, gmother2);

        Human child1 = new Human("ggg",true, 4, father, mother);
        Human child2 = new Human("hhh",false, 3, father, mother);
        Human child3 = new Human("iii",false, 2, father, mother);

        System.out.println(gmother1);
        System.out.println(gfather1);
        System.out.println(gmother2);
        System.out.println(gfather2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}