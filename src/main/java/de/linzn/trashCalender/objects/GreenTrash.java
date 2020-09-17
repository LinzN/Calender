/*
 * Copyright (C) 2020. Niklas Linz - All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the LGPLv3 license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the LGPLv3 license with
 * this file. If not, please write to: niklas.linz@enigmar.de
 *
 */

package de.linzn.trashCalender.objects;

import java.util.Date;

public class GreenTrash implements ITrash {

    private Date date;

    public GreenTrash(Date date) {
        this.date = date;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getName() {
        return "Bio Tonne";
    }

    @Override
    public TrashType getType() {
        return TrashType.GREEN;
    }
}
