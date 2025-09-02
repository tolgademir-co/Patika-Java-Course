package patika_6_beyond_classes.sealed;

public sealed class Shape permits Circle, Rectangle, Line {

    // final ** extends edilemez yapıyorsunuz
    // sealed -> permits ** sadece belirli classları extends edebilmesine izin veriyorsunuz
    // non-sealed ** herkes extends edebilir anlamına geliyor

}
