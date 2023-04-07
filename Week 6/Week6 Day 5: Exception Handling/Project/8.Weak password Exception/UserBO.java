class UserBO {
    public static void validate(User u) throws WeakPasswordException {
        String password = u.getPassword();
        if (password == null || password.isEmpty()) {
            throw new WeakPasswordException("Your password is weak");
        }

        int length = password.length();
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasLetter = false;

        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (!Character.isWhitespace(c)) {
                hasSpecial = true;
            }

            if (hasDigit && hasSpecial && hasLetter && length >= 8 && length <= 20) {
                return;
            }
        }

        throw new WeakPasswordException("Your password is weak");
    }
}
