create table t_karyawan (
    id                      integer auto_increment,
    nama                    varchar(100) not null,
    gaji_pokok              decimal(18,2) not null,
    absensi                 integer default 0,
    jumlah_cuti             integer default 0,
    status                  varchar(100),
    tunjangan_makan         decimal(18,2) default 0,
    tunjangan_transport     decimal(18,2) default 0,
    total_gaji              decimal(18,2) default 0,
    primary key(id)
);