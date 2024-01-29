public class School {
    User[]users;

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public int quantityOfStudents(){
        int count = 0;
        for(User user : users){
            if(user.getAge()<10){
                count++;;
                System.out.println(user.getName());
            }
        }
        return count;
    }
}
