package ekalia.uts18090018.WikaSnack.activity.login

import ekalia.uts18090018.WikaSnack.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}